package cn.eyeo.tech.graph.model.hobby;

import cn.eyeo.tech.graph.common.model.ToString;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

/**
 * 阅读爱好
 *
 * @author amos.wang
 * @date 2025/10/19
 */
@Getter
@Setter
@Node("ReadBookHobby")
public class ReadBookHobby extends ToString {

    @Id
    @GeneratedValue
    private Long id;

    /**
     * 名字
     */
    @Property("bookName")
    private String bookName;

    /**
     * 类型
     */
    @Property("bookType")
    private String bookType;

    /**
     * 描述
     */
    @Property("description")
    private String description;

}
