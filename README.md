# iBanka
### Zadání iBanka

Internetové bankovnictví

***Enum DruhTransakce {***

 PŘÍCHOZÍ,
 
 ODCHOZÍ
 
}

### Třída Transakce

atributy:

• String čísloÚčtu; 
> např: 356987

• int kódBanky;

• int částka;

• DruhTransakce druh;
> kdo nezvládne enum, udělá to jako char a písmeno ‘P‘ bude příchozí a ‘O‘ bude odchozí a upraví podle toho zbytek programu

metody:

• parametrický konstruktor, gettery, přetížit toString()

### Třída SeznamTransakcí

atributy:

• pole/seznam transakcí

• další dle libosti

metody:

• void přidejTransakci(Transakce transakce);

• void vypišTransakce() ;

• void vypišTransakce(DruhTransakce druh);
> vypíše transakce jenom zadaného druhu

• void vypišTransakce(String čísloÚčtu, int kódBanky);
> vypíše transakce, které se týkají konkrétního účtu včetně kódu banky

• Transakce najdiNejvětšíTransakci(DruhTransakce druh);
> nalezne největší transakci podle zadaného druhu transakce (takže největší příchozí nebo největší odchozí)

• int sumaTransakcí(String čísloÚčtu, int kódBanky, DruhTransakce druh); 
> vypočítá sumu transakcí týkajících se konkrétního účtu, buď jen příchozí nebo jen odchozí podle parametru druh

• uložTransakceDoSouboru(String názevSouboru, DruhTransakce druh) 
> uloží transakce zadaného druhu transakce (takže jen příchozí nebo jen odchozí)
