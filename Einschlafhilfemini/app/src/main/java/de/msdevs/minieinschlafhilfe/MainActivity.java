package de.msdevs.minieinschlafhilfe;

import android.app.*;
import android.os.*;
import android.app.*;
import android.content.*;
import android.os.*;
import android.provider.*;
import android.support.v7.app.*;
import android.support.v7.widget.*;
import android.text.*;
import android.text.method.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import java.util.*;

public class MainActivity extends AppCompatActivity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		getSupportActionBar().setHomeButtonEnabled(true);  
		getSupportActionBar().setDisplayShowHomeEnabled(true);  
		getSupportActionBar().setDisplayUseLogoEnabled(true);  
		getSupportActionBar().setLogo(R.drawable.ic_launcher);  
		getSupportActionBar().setDisplayShowTitleEnabled(true);
		
		
		//Button aus dem main.xml layout
		final Button button = (Button) findViewById(R.id.btn_choose);
		//RandomGenerator für die zufällige auswahl einer folge
		final Random randomGenerator = new Random();
		//Array list mit folgen items
		final ArrayList folgen = new ArrayList() {{ 
				 //Die dr3i Folgen:
            add("Die dr3i -: Das Seeungeheuer:(Die Dr3i)");
            add("Die dr3i -: Verschollen in der Zeit:(Die Dr3i)");
            add("Die dr3i -: Tödliche Regie:(Die Dr3i)");
            add("Die dr3i -: Das Haus der 1.000 Rätsel:(Die Dr3i)");
            add("Die dr3i -: und der kopflose Reiter:(Die Dr3i)");
            add("Die dr3i -: Der Jahrhundertstein:(Die Dr3i)");
            add("Die dr3i -: Die Pforte zum Jehenseits:(Die Dr3i)");
            add("Die dr3i -: Zug um Zug:(Die Dr3i)");
            //Die drei Fragezeichen Folggen:
            add("Die drei ??? -:Toteninsel:100");
            add("Die drei ??? -: Rufmord:99");
            add("Die drei ??? -: Tal des Schreckens:98");
            add("Die drei ??? -: Insektenstachel:97");
            add("Die drei ???: und der rote Rächer:96");
            add("Die drei ??? -: Botschaft von Geisterhand:95");
            add("Die drei ??? -: Das schwarze Monster:94");
            add("Die drei ??? -: Das Geisterschiff:93");
            add("Die drei ??? -: Todesflug:92");
            add("Die drei ??? -: Labyrinth der Götter:91");
            add("Die drei ??? -: Der Feuerteufel:90");
            add("Die drei ??? -: Tödliche Spur:89");
            add("Die drei ??? -: Vampir im Internet:88");
            add("Die drei ??? -: Wolfsgesicht:87");
            add("Die drei ??? -: Nacht in Angst:86");
            add("Die drei ??? -: Feuerturm:85");
            add("Die drei ??? -: Musik des Teufels:84");
            add("Die drei ??? -: Meuterei auf hoher See:83");
            add("Die drei ??? -: Die Karten des Bösen:82");
            add("Die drei ??? -: Geheimakte Ufo:81");
            add("Die drei ??? -: Verdeckte Fouls:80");
            add("Die drei ??? -: Im Bann des Voodoo:79");
            add("Die drei ??? -: Das leere Grab:78");
            add("Die drei ??? -: Pistenteufel:77");
            add("Die drei ??? -: Stimmen aus dem Nichts:76");
            add("Die drei ??? -: Die Spur des Raben:75");
            add("Die drei ???: und das brennende Schwert:74");
            add("Die drei ??? -: Poltergeist:73");
            add("Die drei ??? -: Dreckiger Deal:72");
            add("Die drei ??? -: Die verschwundene Seglerin:71");
            add("Die drei ??? -: Schüsse aus dem Dunkel:70");
            add("Die drei ??? -: Späte Rache:69");
            add("Die drei ???: und der Schatz im Bergsee:68");
            add("Die drei ???: und das Geheimnis der Särge:67");
            add("Die drei ???: und die Schattenmänner:66");
            add("Die drei ??? -: Diamantenschmuggel:65");
            add("Die drei ??? -: Geisterstadt:64");
            add("Die drei ??? -: Fußball-Ganster:63");
            add("Die drei ??? -: Spuk im Hotel:62");
            add("Die drei ???: und die Rache des Tigers:61");
            add("Die drei ??? -: Dopingmixer:60");
            add("Die drei ??? -: Giftiges Wasser:59");
            add("Die drei ???: und der verrückte Maler:58");
            add("Die drei ??? -: Tatort Zirkus:57");
            add("Die drei ??? -: Angriff der Computer-Viren:56");
            add("Die drei ??? -: Gekaufte Spieler:55");
            add("Die drei ??? -: Gefahr im Verzug:54");
            add("Die drei ??? -: Die Automafia:53");
            add("Die drei ??? -: Die Musikpiraten:52");
            add("Die drei ??? -: Der riskante Ritt:51");
            add("Die drei ???: und der verschwundene Filmstar:50");
            add("Die drei ???: und der Superpapagei:1");
            add("Die drei ???: und der Phantomsee:2");
            add("Die drei ???: und der Karpatenhund:3");
            add("Die drei ???: und die schwarze Katze:4");
            add("Die drei ???: und der Fluch des Rubins:5");
            add("Die drei ???: und der sprechende Totenkopf:6");
            add("Die drei ???: und der unheimliche Drache:7");
            add("Die drei ???: und der grüne Geist:8");
            add("Die drei ???: und die rätselhaften Bilder:9");
            add("Die drei ???: und die flüsternde Mumie:10");
            add("Die drei ???: und das Gespensterschloss:11");
            add("Die drei ???: und der seltsame Wecker:12");
            add("Die drei ???: und der lachende Schatten:13");
            add("Die drei ???: und das Bergmonster:14");
            add("Die drei ???: und der rasende Löwe:15");
            add("Die drei ???: und der Zauberspiegel:16");
            add("Die drei ???: und die gefährliche Erbschaft:17");
            add("Die drei ???: und die Geisterinsel:18");
            add("Die drei ???: und der Teufelsberg:19");
            add("Die drei ???: und die flammende Spur:20");
            add("Die drei ???: und der tanzende Teufel:21");
            add("Die drei ???: und der verschwundene Schatz:22");
            add("Die drei ???: und das Aztekenschwert:23");
            add("Die drei ???: und die silberne:24");
            add("Die drei ???: und die singende Schlange:25");
            add("Die drei ???: und die Silbermine:26");
            add("Die drei ???: und der magische Kreis:27");
            add("Die drei ???: und der Doppelgänger:28");
            add("Die drei ???: - Die Originalmusik:29");
            add("Die drei ???: und das Riff der Haie:30");
            add("Die drei ???: und das Narbengesicht:31");
            add("Die drei ???: und der Ameisenmensch:32");
            add("Die drei ???: und die bedrohte Ranch:33");
            add("Die drei ???: und der rote Pirat:34");
            add("Die drei ???: und der Höhlenmensch:35");
            add("Die drei ???: und der Super-Wal:36");
            add("Die drei ???: und der heimliche Hehler:37");
            add("Die drei ???: und der unsichtbare Gegner:38");
            add("Die drei ???: und die Perlenvögel:39");
            add("Die drei ???: und der Automarder:40");
            add("Die drei ???: und das Volk der Winde:41");
            add("Die drei ???: und der weinende Sarg:42");
            add("Die drei ???: und der höllische Werwolf:43");
            add("Die drei ???: und der gestohlene Preis:44");
            add("Die drei ???: und das Gold der Wikinger:45");
            add("Die drei ???: und der schrullige Millionär:46");
            add("Die drei ???: und der giftige Gockel:47");
            add("Die drei ???: und die gefährlichen Fässer:48");
            add("Die drei ???: und die Comic-Diebe:49");
            add("Die drei ???: und der verschwundene Filmstar:50");
            //Folgen ab 100 bis 150
            add("Die drei ??? -: Hexen-Handy:101");
            add("Die drei ??? -: Doppelte Täuschung:102");
            add("Die drei ??? -: Das Erbe des Meisterdiebs:103");
            add("Die drei ??? - Gift per E-Mail:104");
            add("Die drei ???: und der Nebelberg:105");
            add("Die drei ??? -: Der Mann ohne Kopf:106");
            add("Die drei ??? -: Der Schatz der Mönche:107");
            add("Die drei ??? -: Die sieben Tore:108");
            add("Die drei ??? -: Gefährliches Quiz:109");
            add("Die drei ??? -: Panik im Park:110");
            add("Die drei ??? -: Die Höhle des Grauens:111");
            add("Die drei ??? -: Schlucht der Dämonen:112");
            add("Die drei ??? -: Das Auge des Drachen:113");
            add("Die drei ??? -: Die Villa der Toten:114");
            add("Die drei ??? -: Auf tödlichem Kurs:115");
            add("Die drei ??? -: Codename Cobra:116");
            add("Die drei ??? -: Der finstere Rivale:117");
            add("Die drei ??? -: Das düstere Vermächtnis:118");
            add("Die drei ??? -: Der geheime Schlüssel:119");
            add("Die drei ??? -: Der schwarze Skorpion:120");
            add("Die drei ??? -: Spur ins Nichts:121");
            add("Die drei ???: und der Geisterzug:122");
            add("Die drei ??? -: Fußballfieber:123");
            add("Die drei ??? -: Geister-Canyon:124");
            add("Die drei ??? -: Feuermond:125");
            add("Die drei ??? -: Schrecken aus dem Moor:126");
            add("Die drei ??? -: Schwarze Madonna:127");
            add("Die drei ??? -: Schatten über Hollywood:128");
            add("Die drei ??? -: SMS aus dem Grab:129");
            add("Die drei ??? -: Der Fluch des Drachen:130");
            add("Die drei ??? -: Haus des Schreckens:131");
            add("Die drei ??? -: Spuk im Netz:132");
            add("Die drei ??? -: Fels der Dämonen:133");
            add("Die drei ??? -: Der tote Mönch:134");
            add("Die drei ??? -: Fluch des Piraten:135");
            add("Die drei ???: und das versunkene Dorf:136");
            add("Die drei ??? -: Pfad der Angst:137");
            add("Die drei ??? -: Die geheime Treppe:138");
            add("Die drei ??? -: Das Geheimnis der Diva:139");
            add("Die drei ??? -: Stadt der Vampire:140");
            add("Die drei ???: und die Fußball-Falle:141");
            add("Die drei ??? -: Tödliches Eis:142");
            add("Die drei ???: und die Poker-Hölle:143");
            add("Die drei ??? -: Zwillinge der Finsternis:144");
            add("Die drei ???: und die Rache der Samurai:145");
            add("Die drei ??? -: Der Biss der Bestie:146");
            add("Die drei ??? -: Grusel auf Campbell Castle:147");
            add("Die drei ???: und die feurige Flut:148");
            add("Die drei ??? -: Der namenlose Gegner:149");
            add("Die drei ??? -: Geisterbucht:150");
            //Folgen 151 - Ende
            add("Die drei ??? -: Schwarze Sonne:151");
            add("Die drei ??? -: Skateboardfieber:152");
            add("Die drei ???: und das Fußballphantom:153");
            add("Die drei ??? -: Botschaft aus der Unterwelt:154");
            add("Die drei ???: und der Meister des Todes:155");
            add("Die drei ??? -: Im Netz des Drachen:156");
            add("Die drei ??? -: Im Zeichen der Schlangen:157");
            add("Die drei ???: und der Feuergeist:158");
            add("Die drei ??? -: Nacht der Tiger:159");
            add("Die drei ??? -: Geheimnisvolle Botschaften:160");
            add("Die drei ??? -: Die blutenden Bilder:161");
            add("Die drei ???: und der schreiende Nebel:162");
            add("Die drei ???: und der verschollene Pilot:163");
            add("Die drei ??? -: Fußball-Teufel:164");
            add("Die drei ??? -: Im Schatten des Giganten:165");
            add("Die drei ???:  und die brennende Stadt:166");
            add("Die drei ???: und das blaue Biest:167");
            add("Die drei ??? -: GPS Gangster:168");
            add("Die drei ???: und die Spur des Spielers:169");
            add("Die drei ??? -: Straße des Grauens:170");
            add("Die drei ???: und das Phantom aus dem Meer:171");
            add("Die drei ???: und der Eisenmann:172");
            add("Die drei ??? -: Dämon der Rache:173");
            add("Die drei ??? und das Tuch der Toten:174");
            add("Die drei ??? -: Schattenwelt:175");
            add("Die drei ???: und der gestohlene Sieg:176");
            add("Die drei ??? -: Der Geist des Goldgräbers:177");
            add("Die drei ??? -: Der gefiederte Schrecken:178");
            add("Die drei ??? -: Die Rache des Untoten:179");
            add("Die drei ??? -: Die flüsternden Puppen:180");
            add("Die drei ??? -: Das Kabinett des Zauberers:181");
            add("Die drei ??? -: Im Haus des Henkers:182");
            add("Die drei ???: und der letzte Song:183");
            add("Die drei ???: und der Hexengarten:184");
            add("Die drei ???: und der Mann ohne Augen:185");
            add("Die drei ??? -: Insel des Vergessens:186");
            add("Die drei ???: und das silberne Amulett:187");
            add("Die drei ??? -: Signale aus dem Jenseits:188");
            add("Die drei ???: und der unsichtbare Passagier:189");
            add("Die drei ???: und die Kammer der Rätsel:190");
            add("Die drei ??? -: Verbrechen im Nichts:191");
            add("Die drei ??? -: Im Bann des Drachens:192");
            add("Die drei ??? -: Schrecken aus der Tiefe:193");
            add("Die drei ???: und die Zeitreisende:194");
            add("Die drei ??? -: Im Reich der Ungeheuer:195");
            add("Die drei ??? -: Geheimnis des Bauchredners:196");
			}};
		
		
		button.setOnClickListener(new View.OnClickListener()
			{
				public void onClick(View v)
				{
					//Folge von den folgen auswählen lassen über den randomgenerator
					String folge = (String) folgen.get(randomGenerator.nextInt(folgen.size()));

					
					//Folge von der Folgennummer spliten
					final String string_teil_eins;
					final String string_teil_zwei;
					String[] itemSplit = folge.split(":");
					string_teil_eins = itemSplit[0];
					string_teil_zwei = itemSplit[1];
					
                			 //Anzeigen lassen über TextView		
					//gesplitete Folgen Strings hinzufügen. (Neue Zeile)
					 TextView tv_folge = (TextView)findViewById(R.id.tv_folge);
					 tv_folge.setText("Name:" + " " + string_teil_eins + "\n" + "Nummer:" + " " + string_teil_zwei);
					
					}
				});
			
			
		
    }
}
