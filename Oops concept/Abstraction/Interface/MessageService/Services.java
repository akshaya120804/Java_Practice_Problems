package Abstraction.Interface.MessageService;

class WhatsApp implements MessagingService {
    public void sendMessage(String message) {
        System.out.println("Sending via WhatsApp: " + message);
    }
}

class Telegram implements MessagingService {
    public void sendMessage(String message) {
        System.out.println("Sending via Telegram: " + message);
    }
}

class Signal implements MessagingService {
    public void sendMessage(String message) {
        System.out.println("Sending via Signal: " + message);
    }
}
