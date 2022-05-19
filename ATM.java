
package z1metod_alıştırma;


public class ATM {
       
  public int Banka_bakiye = 0;
  public int Kredikart_bakiye=1700;


public void para_ekle(int sayı1) {
    
    Banka_bakiye += sayı1;
    System.out.println(sayı1+" TL Banka Kartınıza Eklendi...");
    
    
}  

public void para_cek(int sayı1) {
    if(Banka_bakiye>sayı1) {
    Banka_bakiye -= sayı1;
    System.out.println(sayı1+" TL Hesabınızdan Çekildi..."); }
    
    else {
        System.out.println("Yetersiz Bakiye Daha Düşük Tutar Giriniz...");
    }
    
}


public void kredikart_paracek(int sayı1) {
    
    if(Kredikart_bakiye>sayı1) {
        Kredikart_bakiye-= sayı1;
        System.out.println(sayı1 +" TL Hesabınızdan Çekildi...");
                
    }
    else {
        System.out.println("Kredi Kartınızın limiti bu miktar için yetersiz...");
    }
    
    
}

public void kredikart_borcOde(int sayı1) {
    if(Kredikart_bakiye<1700){
    Kredikart_bakiye+= sayı1; 
        System.out.println("Borcunuz Ödendi...");
        if(Kredikart_bakiye>1700) {
        int para_üstü = Kredikart_bakiye - 1700;
        Kredikart_bakiye -= para_üstü;
        System.out.println("Para Üstünüz: "+para_üstü+" TL"); }
    }
    else if(Kredikart_bakiye==1700) {
        System.out.println("Kart Borcunuz Bulunmamaktadır....");
    }
   
   
    
} 
        
}




