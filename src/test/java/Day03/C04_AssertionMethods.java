package Day03;

import org.junit.Assert;
import org.junit.Test;

public class C04_AssertionMethods {
    @Test
    public void assertEqualsTest() {
        Assert.assertEquals(1, 1);

    }
@Test
    public void assertTrueTest() {
        Assert.assertTrue(true);


}
@Test
    public void assertFalseTest() {
        Assert.assertFalse(false);

    }
    @Test
    public void assertNotNullTest() {
        Assert.assertNotNull(null);

    }
    @Test
    public void assertNullTest() {
        Assert.assertNull(null);

    }
    @Test
    public void assertNotEqualsTest() {
        Assert.assertNotEquals(1, 2);

    }
    @Test
    public void assertEqualsIgnoreOrderTest() {
        Assert.assertEquals(1, 1, 1);

    }

    @Test
    public void assertSameTest() {
        Assert.assertSame(new String("Karl"), new String("Karl"));


    }
    @Test
    public void assertNotSameTest() {
        Assert.assertNotSame(new String("Karl"), new String("Karl"));
    }
    @Test
    public void assertArrayEquals() {
        int [] arr1={1,2,3,4,5},arr2={5,4,3,2,1};
        Assert.assertArrayEquals(arr1,arr2);

    }
    @Test
    public void assertEqualsWithMessage() {
        Assert.assertEquals("Bu değerler eşit değil!!!",1,5);

    }


}
