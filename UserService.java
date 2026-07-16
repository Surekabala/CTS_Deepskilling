package mockitoexercises;

public class UserService {
    private NotificationService notificationService;

    public UserService(NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public String registerUser(){
        return notificationService.sendNotification();
    }
}
