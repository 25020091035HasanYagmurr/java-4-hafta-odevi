# ☕ Java Nesne Yönelimli Programlama (OOP) — 4. Hafta Uygulamaları

Bu depo, **Kahramanmaraş İstiklal Bilim ve Teknoloji Üniversitesi — Yazılım Mühendisliği** bölümü Nesne Yönelimli Programlama (OOP) dersi kapsamında geliştirilen **10 adet Java uygulamasını** içermektedir. 

Çalışmalar; **Kalıtım (Inheritance)**, **Çok Biçimlilik (Polymorphism)**, **Dinamik Veri Yapıları (`ArrayList`)**, **Sınıf Hiyerarşileri** ve **Algoritmik Problem Çözme** prensiplerini pekiştirmek amacıyla modüler bir paket yapısıyla tasarlanmıştır.

---

## 🛠️ Kullanılan Teknolojiler ve Araçlar

* **Programlama Dili:** Java (JDK 21)
* **Geliştirme Ortamı (IDE):** IntelliJ IDEA
* **Modelleme & Dokümantasyon:** Mermaid UML Sınıf Diyagramları & Markdown
* **Versiyon Kontrol:** Git & GitHub

---

## 📂 Proje İçeriği ve Uygulamalar

Her soru bağımsız bir paket (`q1` – `q10`) altında yapılandırılmış olup, ilgili klasör içerisindeki `README.md` dosyasında sınıf ilişkilerini gösteren **UML Sınıf Diyagramları** yer almaktadır.

| Soru | Konu | Kapsam ve Teknik Detaylar | UML & Kaynak Kod |
| :---: | :--- | :--- | :---: |
| **Q1** | **Triangle Sınıfı** | `GeometricObject` üst sınıfından kalıtım alan `Triangle` sınıfı, üçgen kenar uzunlukları ile alan/çevre hesaplamaları ve özelleştirilmiş `toString()` metodu. | [İncele](./Q1) |
| **Q2** | **Person Sınıf Hiyerarşisi** | `Person` temel sınıfından türeyen `Student`, `Employee`, `Faculty` ve `Staff` alt sınıfları ile çok seviyeli kalıtım ve metot ezme (overriding). | [İncele](./Q2) |
| **Q3** | **Account Alt Sınıfları** | Banka hesabı (`Account`) sınıfından türetilen vadeli (`SavingsAccount` - kredi limiti olmayan) ve vadesiz (`CheckingAccount` - kredili mevduat limitli) hesap modelleri. | [İncele](./Q3) |
| **Q4** | **ArrayList Maksimum Eleman** | `ArrayList<Integer>` koleksiyonu üzerinde `null` ve boş liste güvenliği sağlanarak en büyük elemanın bulunması. | [İncele](./Q4) |
| **Q5** | **Course Yönetimi** | Sabit boyutlu diziler yerine dinamik `ArrayList<String>` yapısı kullanılarak yeniden tasarlanan ders ve öğrenci kayıt yönetim sistemi. | [İncele](./Q5) |
| **Q6** | **Farklı Nesnelerin Listelenmesi** | `ArrayList<Object>` içerisinde farklı türdeki nesnelerin (`Loan`, `Date`, `String`, `Circle`) bir arada tutulması ve çok biçimli `toString()` çıktıları. | [İncele](./Q6) |
| **Q7** | **Liste Karıştırma (Shuffle)** | `ArrayList<Integer>` elemanlarının `Collections.shuffle()` algoritması ile rastgele sıralanması. | [İncele](./Q7) |
| **Q8** | **Gelişmiş Account & Transaction** | Müşteri adı ve her para yatırma/çekme (`D`/`W`) hareketini tarih, tutar ve güncel bakiye bilgisiyle `Transaction` nesnesi olarak kaydeden hesap sistemi. | [İncele](./Q8) |
| **Q9** | **Rastgele Matris Analizi** | Kullanıcıdan alınan $n$ boyutuna göre rastgele `0` ve `1` değerleriyle oluşturulan $n \times n$ matriste en çok `1` içeren satır ve sütun indekslerinin `ArrayList` ile tespiti. | [İncele](./Q9) |
| **Q10** | **MyStack (Inheritance)** | `ArrayList` sınıfından doğrudan kalıtım alınarak oluşturulan LIFO (Son Giren İlk Çıkar) prensibine dayalı özel yığın (Stack) veri yapısı. | [İncele](./Q10) |

---

## 🗂️ Dizin Yapısı

```text
java-4-hafta-odevi/
├── Q1/
│   ├── src/q1/          # Triangle, GeometricObject ve Main sınıfları
│   └── README.md        # Q1 UML sınıf diyagramı ve açıklaması
├── Q2/
│   ├── src/q2/          # Person, Student, Employee, Faculty, Staff ve Main sınıfları
│   └── README.md        # Q2 UML sınıf diyagramı ve açıklaması
├── ...
├── Q10/
│   ├── src/q10/         # MyStack ve Main sınıfları
│   └── README.md        # Q10 UML sınıf diyagramı ve açıklaması
└── README.md            # Ana proje dokümantasyonu
