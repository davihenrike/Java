public class iPhone {
    private MusicPlayer musicPlayer;
    private PhoneDevice phoneDevice;
    private WebBrowser webBrowser;

    public iPhone() {
        this.musicPlayer = new MusicPlayer();
        this.phoneDevice = new PhoneDevice();
        this.webBrowser = new WebBrowser();
    }
}

public class MusicPlayer {
    private String currentSong;

    public void play() {
        // Implementação do método play()
    }

    public void pause() {
        // Implementação do método pause()
    }

    public void selectSong(String song) {
        this.currentSong = song;
        // Implementação do método selectSong(String)
    }
}

public class PhoneDevice {
    private String currentCall;

    public void call(String number) {
        // Implementação do método call(String)
    }

    public void answer() {
        // Implementação do método answer()
    }

    public void voicemail() {
        // Implementação do método voicemail()
    }
}

public class WebBrowser {
    private String currentPage;

    public void displayPage(String url) {
        // Implementação do método displayPage(String)
    }

    public void addNewTab() {
        // Implementação do método addNewTab()
    }

    public void refreshPage() {
        // Implementação do método refreshPage()
    }
}
