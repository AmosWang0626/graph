package cn.eyeo.tech.graph.model.hobby;

import cn.eyeo.tech.graph.common.model.ToString;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

/**
 * 运动爱好
 *
 * @author amos.wang
 * @date 2025/10/19
 */
@Getter
@Setter
@Node("SportHobby")
public class SportHobby extends ToString {

    @Id
    @GeneratedValue
    private Long id;

    /**
     * 运动名字
     */
    @Property("sportName")
    private String sportName;

    /**
     * 运动类型
     */
    @Property("sportType")
    private String sportType;

    /**
     * 运动描述
     */
    @Property("description")
    private String description;

}
