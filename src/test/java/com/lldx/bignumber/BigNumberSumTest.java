package com.lldx.bignumber;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author: Dr.pan@protonmail.com
 * @date: 2018/11/23
 */
public class BigNumberSumTest {

    @Test
    public void testBigNumberSum(){
        BigNumberSum bigNumberSum = new BigNumberSum();
        String res = bigNumberSum.bigNumberSum("11111111111111111111", "2222222222222222222");
        Assert.assertEquals("13333333333333333333", res);

        res = bigNumberSum.bigNumberSum("11111111111111111119", "2222222222222222222");
        Assert.assertEquals("13333333333333333341", res);
    }

}
