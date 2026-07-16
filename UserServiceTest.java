package mockitoexercises;

import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    public void testRegisterUser() {

        NotificationService notificationService = mock(NotificationService.class);

        UserService userService = new UserService(notificationService);


        when(notificationService.sendNotification())
                .thenReturn("Mock Notification");

        userService.registerUser();

        verify(notificationService).sendNotification();
    }
}