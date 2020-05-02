package mins.study.tdd.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonUtilTest {

    @Test
    void stringJoining() {
        // GIVE
        String str1 = "a";
        String str2 = "b";
        String str3 = "c";

        // WHEN
        String joiningStr = CommonUtil.stringJoining(",", str1, str2, str3);

        // THEN
        Assertions.assertNotNull(joiningStr);
        Assertions.assertTrue(joiningStr.contains(str1));
        Assertions.assertTrue(joiningStr.contains(str2));
        Assertions.assertTrue(joiningStr.contains(str3));
    }
}