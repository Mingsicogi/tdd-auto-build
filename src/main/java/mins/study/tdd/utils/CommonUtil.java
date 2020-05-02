package mins.study.tdd.utils;

public class CommonUtil {

    /**
     * 문자열 조합
     *
     * @param delimiter 구분자
     * @param contents 문자 리스트
     * @return String
     */
    public static String stringJoining(String delimiter, String... contents) {
        return String.join(delimiter, contents);
    }
}
