import java.util.Scanner;

public class loops_practice {
    public static void main(String[]args){
        //Q- write a code to find factorial of number which is given by user.
        //2! = 2*1 , 5 = 5*4*3*2*1 , Example of factorial

        System.out.println("Enter the number get factorial");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial = 1;
        for (int i=num; i>=1; i--){
            factorial = factorial*i;

        }
        System.out.println(factorial);
        // Q - write  a program to print Fibonacci series of n terms where n is input
        //by user: 0, 1,1,2,3,5,8,13,24
        //sum of first two number is third number-------help
        System.out.println("Enter the number for which you want to find Fibonacci Number");
        int number= sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i =0; i<number-2; i++ ){
            int c = a+b;
            System.out.println(c+" ");
            a=b;
            b=c;
        }
// find x raise to the power y
        /*two numbers are entered through the keyboard write a program to find the value of
        one number raised to the power of another. (do not use java built in method)

        * */
        System.out.println("Enter the number to find its power ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = 1;
        for (int i =0; i<y; i++){
            result *=x;
        }
        System.out.println(result);
        // Primer number or not ?
        /*Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime
        number or not
        *
        *
        *
        * */
        System.out.println("Enter the number to know is it prime or not - ");
        boolean isPrime = true;
int inp = sc.nextInt();
//for (int i =2; i<inp; i++){        or
for (int i =2; i*i<=inp; i++){

    if (inp%i==0){
        isPrime = false;
        break;
    }

}
        if (inp<2){
            isPrime=false;
            System.out.println(isPrime+ "not a prime number");
        }
        System.out.println(isPrime);

//Series Sum
        /*Write a program to calculate the sum of the following series where n is input by user
        * 1+1/2+1/3+1/4+1/5+...............1/n*/
        System.out.println("Write a number for series sum");
        int u= sc.nextInt();
        float outPut = 0;
        for(float i=1; i<=u; i++){
    outPut += 1/i;
        }
        System.out.println(outPut);



/*series sum2;
Compute the natural logarithm of 2, by adding up to n terms in the series
1-1/2+1/3-1/4+1/5-........1/n
where n is a positive integer and input by user.
* */

    }


}


/*
Devachiye dwari ubha shkanbhari tene mukti chari sadhiyelya||
hari mukhe mhana hari mukhe mhana punyachi ganana kon kari||
Asoni sansari jivhe vegu kari vedshastra ubhari bahyasada||
Dnyandev mhane vyasachiya khuna dwarkecha rana pandhavaghari||
Hari mukhe mhana hari mukhe mhana punyachi ganana kon kari||1|| Vitthal vitthal Vitthal

chahu vedi jan sahi shastri karan atarahi purane harisi gathi||
manthoni navneeta taise ghe ananta vaya vyarth katha sandi marg||
ek hari atma jiv shiv sam vaya tu durgman ghali man||
Dnayndeva path hari ha vaikunta bharala gandat hari dise||
Hari mukhe mhana hari mukhe mhana punyachi ganana kon kari||2|| Vitthal Vitthal Vitthal

trigun asar nirgun he sar sarasar vichar haripath||
sagun nirgun gunache agun harivin man vyarth jay||
avyakta nirakar nahi jya akar jethuni charachar harisi bhaje||
dnayndeva dhyani ram krushna mani ananat jannmuni punya hoy||
Hari mukhe mhana hari mukhe mhana punyachi ganana kon kari||3|| Vitthal Vitthal Vitthal

bhavevin bhakti bhaktivin mukti balevin shakti bolu naye||
kaiseni daivata prassana twarit uga rahi nivant shinsi vaya||
sayase karisi prapanch dinnishi harisi n bhajasi kavnya gune||
dnyandev mhane harijap karane tutel dharane prapanchache||
hari mukhe mhana hari mukhe mhana punyachi ganana kon kari||4|| Vitthal vitthal Vitthal

yogyag vidhi yene nohe siddhi vayachi upadhi dhamdarm||
bhavevin dev na kale nisandeh guruvin anubhav kaisa kale||
tapevin daivat didhalya vin prapt gujevin hit kon sange||
Dnyandev sange drushantachi math sadhunche sangti tarnopay||
Hari mukhe mhana Hari mukhe mhana punyachi ganana kon kari||5|| Vitthal Vitthal Vitthal

Sadhu both jhala to nuroniya thela thayich murala anubhav||
kapurachi vathi ujalali jyoti thayich sampati jhali jaise||
moksh rekhe bhagya vintala sadhuncha ankila haribhakt||
dnyandeva godi sangati sajjani Haridise janvani atmtatvi||
Hari mukhe mhana hari mukhe mhana punyachi ganana kon kari||6|| Vitthal Vitthal Vitthal

parvatapramane patake karane vajrlep hone abhaktasi||
nahi jyasi bhakti to patit abhakt harisi na bhajata daivhat||
anant vachal baralati baral tya kaisa dayala pave hari||
Dnyandeva praman atma ha nidhan sarvanghati purn ek nande||
Hari mukhe mhana Hari mukhe mhana punyachi ganana kon kari ||7|| Vitthal Vitthal Vitthal

santache sangati manomarg gati akalava shripati yene pante||
ram krushna vacha bhav ha jivacha atma jo shivacha ram jap||
ek tattvi nam sadhiti sadhan dwetache bandahan na badhije||
nammrut godi vaishnava ladhali yogiya sadhali jivankala||
satar ucchar pralhadi bimbala udhavala krushndata||
Dnyandev mhane nam he sulabh sarvtra durlbh virala jane||
Hari mukhe mhana hari mukhe mhana punyachi ganana kon kari||8|| Vitthal Vitthal Vitthal

Vishnuvin jap vyarth tyahce ramkrushni man nahi jyache||
upjoni karanta nene advet vata ramkrushni paitha kaiseni hoy||
dwetachi jadhani guruvin dnyan taya kaiche kirtan ghadel nami||
dnyandev mhane sagun he dhyan nampath maun prapanchache||
Hari mukhe mhana Hari mukhe mhana punyachi ganana kon kari||9|| Vitthal Vitthal Vitthal

triveni sangme nana tirthe bhrami chitta nahi nami tari te vyarth||
Namasi vinmukh to nar papiya harivin dhavaya na pave kon||
















 */










