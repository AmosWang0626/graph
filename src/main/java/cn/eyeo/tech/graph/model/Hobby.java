package cn.eyeo.tech.graph.model;

import cn.eyeo.tech.graph.common.model.ToString;
import cn.eyeo.tech.graph.model.hobby.CookHobby;
import cn.eyeo.tech.graph.model.hobby.ReadBookHobby;
import cn.eyeo.tech.graph.model.hobby.SportHobby;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.*;

import java.util.List;

/**
 * 个人爱好分类
 *
 * @author amos.wang
 * @date 2025/10/19
 */
@Getter
@Setter
@Node("Hobby")
public class Hobby extends ToString {

    @Id
    @GeneratedValue
    private Long id;

    /**
     * 名字
     */
    @Property("name")
    private String name;

    /**
     * 类型
     */
    @Property("type")
    private String type;

    /**
     * 阅读的爱好
     */
    @Relationship(type = "READ_BOOK_HOBBIES", direction = Relationship.Direction.OUTGOING)
    private List<ReadBookHobby> readBookHobbies;

    /**
     * 运动的爱好
     */
    @Relationship(type = "SPORT_HOBBIES", direction = Relationship.Direction.OUTGOING)
    private List<SportHobby> sportHobbies;

    /**
     * 做饭的爱好
     */
    @Relationship(type = "COOK_HOBBIES", direction = Relationship.Direction.OUTGOING)
    private List<CookHobby> cookHobbies;

}
