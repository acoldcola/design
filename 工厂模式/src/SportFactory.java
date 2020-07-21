/**
 * @Author ZhangKe
 * @Date 2020/7/21 15:16
 * @Version 1.0
 * 工厂
 */
public class SportFactory {

    public static Sport getSport(String sportType) {
        if (sportType == null) {
            return null;
        }
        if ("basketball".equals(sportType)) {
            return new BasketballSport();
        }
        if ("valleyball".equals(sportType)) {
            return new VolleyballSport();
        }
        return null;
    }
}
