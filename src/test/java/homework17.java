import org.testng.Assert;
import org.testng.annotations.Test;

import org.testng.annotations.Test;
public class homework17 extends BaseTest {
@Test
    public void adddsongtoplaylist() throws InterruptedException
{
 String newSongAddNotificationText="Addedd 1s ong into";
 openLoginUrl();
 enterEmail("demo@class.com");
 enterPassword("te$t$tudent");
 clickSubmit();
 searchSong("Pluto");
 clickViewAllBtn();
 selectFirstSongResult();
 clickAddToBtn();
 choosePlayList();
 Assert.assertTrue(getNotificationText().contains(newSongAddNotificationText));
}


    }



