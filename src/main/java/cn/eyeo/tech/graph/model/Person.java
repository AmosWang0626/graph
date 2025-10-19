package cn.eyeo.tech.graph.model;

import cn.eyeo.tech.graph.common.model.ToString;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.*;

import java.util.List;

/**
 * 用户
 *
 * @author amos.wang
 * @date 2025/10/19
 */
@Getter
@Setter
@Node("Person")
public class Person extends ToString {

    @Id
    @GeneratedValue
    private Long id;

    /**
     * 名字
     */
    @Property("name")
    private String name;

    /**
     * 描述
     */
    @Property("description")
    private String description;

    /**
     * 爱好
     */
    @Relationship(type = "HOBBIES", direction = Relationship.Direction.INCOMING)
    private List<Hobby> hobbies;
}
