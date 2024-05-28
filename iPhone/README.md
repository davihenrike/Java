Abaixo o conceito de UML (Marmaid) aplicado ao desafio

classDiagram
    class iPhone {
        - musicPlayer : MusicPlayer
        - phoneDevice : PhoneDevice
        - webBrowser : WebBrowser
        + iPhone()
    }

    class MusicPlayer {
        - currentSong : String
        + play()
        + pause()
        + selectSong(String)
    }

    class PhoneDevice {
        - currentCall : String
        + call(String)
        + answer()
        + voicemail()
    }

    class WebBrowser {
        - currentPage : String
        + displayPage(String)
        + addNewTab()
        + refreshPage()
    }

    iPhone "1" -- "1" MusicPlayer
    iPhone "1" -- "1" PhoneDevice
    iPhone "1" -- "1" WebBrowser