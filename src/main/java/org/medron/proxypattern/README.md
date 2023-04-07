# Proxy Pattern
Proxy, gerçek nesnenin yerine geçer ve gerçek nesneye olan istekleri yönetir. Bu, gerçek nesnenin yükünü azaltabilir ve istemci ile gerçek nesne arasındaki iletişimi daha verimli hale getirebilir. Proxy, gerçek nesne yüklenirken ve yüklenme sonrasında istemciden gelen istekleri ele alabilir ve gerektiğinde gerçek nesne yüklemesini geciktirebilir.

Bu desen, çeşitli senaryolarda kullanılabilir. Örneğin, ağdaki uzaktaki bir nesne ile iletişim kurmak için kullanılabilir. Proxy, gerçek nesneye yapılan istekleri ağ üzerinden göndererek gerçek nesneye olan bağlantıyı kurar. Başka bir örnek, diskteki bir dosyayı okumak için kullanılan bir proxy'dir. Proxy, dosyanın yüklenmesini geciktirebilir ve istemcinin yalnızca dosyanın bir bölümünü okumasına izin verebilir.
***
#### Main Idea
1) Proxy Class take the place which real concrete class.
2) We easily configure the real class in proxy class. 

****
    // Gerçek dosya nesnesi arayüzü
    interface Dosya {
    void oku();
    }
***

    // Gerçek dosya sınıfı
    class GercekDosya implements Dosya {
    private String dosyaAdi;

    public GercekDosya(String dosyaAdi) {
    this.dosyaAdi = dosyaAdi;
    yukle();
    }

    private void yukle() {
    System.out.println("Dosya yükleniyor: " + dosyaAdi);
    }

    public void oku() {
    System.out.println("Dosya okunuyor: " + dosyaAdi);
    }}
***
    // Proxy dosya sınıfı
    class ProxyDosya implements Dosya {
    private String dosyaAdi;
    private GercekDosya gercekDosya;

    public ProxyDosya(String dosyaAdi) {
    this.dosyaAdi = dosyaAdi;
    }

    public void oku() {
    if (gercekDosya == null) {
    gercekDosya = new GercekDosya(dosyaAdi);
    }
    System.out.println("Dosya okunuyor: " + dosyaAdi);
    }}
***
    // Kullanım
    Dosya dosya = new ProxyDosya("ornek_dosya.txt");
    dosya.oku(); // dosya yükleniyor ve okunuyor
    dosya.oku(); // sadece dosya okunuyor (yükleme işlemi tekrar yapılmıyor)
