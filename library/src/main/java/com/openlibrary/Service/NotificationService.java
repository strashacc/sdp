package com.openlibrary.Service;

public class NotificationService implements Observer{
    private static NotificationService instance;

    private NotificationService(){}
    
    public static NotificationService getInstance() {
        if(instance == null)
            instance = new NotificationService();
        return instance;
    }

    @Override
    public void update() {
        // Generate a concrete addition and removel notification method
        
    }
}