package mapper;

import model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Roger on 2015/9/17.
 */
@Repository("userMapper")
public interface UserMapper {
    public List<User> selectAll();
}
