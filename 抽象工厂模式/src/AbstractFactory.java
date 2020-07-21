/**
 * @Author ZhangKe
 * @Date 2020/7/21 15:45
 * @Version 1.0
 */
public abstract class AbstractFactory {
    /**
     * 获取人类性别
     * @param person
     * @return
     */
    public abstract Person getPerson(String person);

    /**
     * 获取运动类型
     * @param sportType
     * @return
     */
    public abstract Sport getSport(String sportType) ;
}
