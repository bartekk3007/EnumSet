import java.util.EnumSet;

public class Main
{
    public static void main(String[] args)
    {
        EnumSet<Season> enumSet1 = EnumSet.of(Season.SPRING, Season.SUMMER, Season.AUTUMN);
        EnumSet<Season> enumSet2 = EnumSet.complementOf(enumSet1);
        EnumSet<Season> enumSet3 = EnumSet.allOf(Season.class);
        EnumSet<Season> enumSet4 = EnumSet.range(Season.SPRING, Season.SUMMER);
        System.out.println(enumSet1);
        System.out.println(enumSet2);
        System.out.println(enumSet3);
        System.out.println(enumSet4);
    }
}