package cn.eyeo.tech.graph.model.hobby;

import cn.eyeo.tech.graph.common.model.ToString;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

/**
 * 烹饪爱好
 *
 * @author amos.wang
 * @date 2025/10/19
 */
@Getter
@Setter
@Node("CookHobby")
public class CookHobby extends ToString {

    @Id
    @GeneratedValue
    private Long id;

    /**
     * 名字
     */
    @Property("cookName")
    private String cookName;

    /**
     * 类型
     */
    @Property("cookType")
    private String cookType;

    /**
     * 描述
     */
    @Property("description")
    private String description;

}