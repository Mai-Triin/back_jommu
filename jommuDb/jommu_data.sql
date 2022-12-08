INSERT INTO public.role (id, type) VALUES (DEFAULT, 'Treener');
INSERT INTO public.role (id, type) VALUES (DEFAULT, 'Treenija');

INSERT INTO public.profile (id, first_name, last_name, date_of_birth, gender, email, terms_accept) VALUES (DEFAULT, 'Mari', 'Murakas', '1986-11-09', 'F', 'mari.murakas@gmail.com', true);
INSERT INTO public.profile (id, first_name, last_name, date_of_birth, gender, email, terms_accept) VALUES (DEFAULT, 'Kadri', 'Karu', '1956-11-09', 'F', 'kadri.karu@gmail.com', true);

INSERT INTO public."user" (id, role_id, profile_id, username, password) VALUES (DEFAULT, 1, 1, 'treener', '123');
INSERT INTO public."user" (id, role_id, profile_id, username, password) VALUES (DEFAULT, 2, 2, 'treenija', '123');

INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'silmaringid', 'kirjeldus1', 'null');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'sõrmesirutus', 'kirjeldus2', 'null');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'ajuraputus', 'kirjeldus3', 'null');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'juuksetõsted', 'kirjeldus4', 'null');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'varbavenitus', 'kirjeldus4', 'null');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'nabakummardus', 'kirjeldus4', 'null');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'Kükkimine kang turjal', 'Seisate jalad umbes õlgade laiuselt. Võtate kangi turjale. Soovi korral võib asetada ka mingi
                    kõrgenduse jalataldade alla. Selg tuleb hoida nõgusalt, tagumik taha ja rind ette ja nii terve harjutuse
                    vältel.Kang turjal istute kükki nii, et selg jääks võimalikult vertikaalsesse asendisse ja sirgeks terve
                    harjutuse vältel. Põlved ei tohiks väga liikuda varvastest ettepoole. Alla istute sujuvalt ja rahulikult, kuniks reied ja sääred moodustavad 90 kraadi nurga või pigem
                    teravama nurga ehk isegi nõks sügavamaleTõusete taas algasendisse tagasi. Mida sügavamale kükite, seda
                    rohkem avaldub mõju tuharalihastele. Kordate sama. Põhirõhk selle harjutusega läheb reie esiosale, tagaosale ja tuharalihastele.', 'null');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'Jalapress', 'Lamate selili jalapressimasinale, asetate jalad üles alusele umbes õlgade laiuselt ja suht üles,
                 vältimaks põlveliigeste vigastusi. Lükkate jalgadega aluse üles, kuniks saab lukusti lahti keerata,
                 langetate põlved rinna suunas kuniks reied ja sääred moodustavad ca 90 ́ või veidi teravama nurga ja
                 surute aluse algasendisse tagasi. Täiesti sirgu ei ole vaja jalgu üleval lükata, vältimaks võimalikke
                 põlvede vigastusi. Kordate sama.
                 Põhirõhk selle harjutusega läheb reie esiosale, tagaosale ja tuharalihastele.', 'null');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'Rumeenia jõutõmme kangiga', 'Enda valida kas teete lahtise kangiga või smithi masinal (kang jookseb siinidel fikseeritult). Võtate
                 kangist kinni õlgade laiuse haardega. Lükkate rinna ette ja tõmbate õlad taha ja abaluud suht kokku,
                 alaselg tuleb hoida kogu harjutuse vältel kas sirgelt või kergelt nõgusana. Hingate sügavalt sisse ja
                 langetate kangi alla kuni nõks üle põlvede ehk seni, kuni tunnete maksimaalset venitust jala tagaosas,
                 asend peaks olema selline nagu parempoolsel pildil. Seejärelt tõmbate taas kangi üles algasendisse
                 tagasi ja ideaalis hingate välja samal ajal sünkroonis tõmbega, kui ei oska siis hoidke nõks hinge kinni
                 ja hingate ülaosas välja. Alla lastes peaksid puusad ja tagumik liikuma taha ja üles tõmmates ette.
                 Vaadake videost täpsemalt sooritustehnikat.
                 Tehke kõik kordused, puhake ja tehke kõik vajalikud seeriad.
                 Põhirõhk selle harjutusega läheb reie tagaosale, tuharale ja ka selja sirutajale.', 'null');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'Säärte kõverdamine pingil', 'Istudes pingil, asetate jalad jalapideme peale, kui on lukusti olemas, tõmbate selle vastu reisi lukku ja
                 tõmbate jalad vastu tuharaid nii kaugele kui tulevad, pingutate ca sekundi lihaseid maksimaalselt ja
                 lasete taas sujuvalt ja kontrollitult algasendisse tagasi. Lamades variatsioon teise videona.
                 Tehke kõik vajalikud kordused, pausid ja seeriad.
                 Põhirõhk selle harjutusega läheb reie tagaosale ja tuharalihastele.', 'null');
 INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'Päkkadele tõus masinal', 'Säärelihaste jõul tõusete maksimaalselt üles päkkadele ja langetate taas maksimaalselt suunates kannad alla. Kordate
                 sama. Ülejäänud keha hoida paigal. Kordate sama.
                 Põhirõhk selle harjutusega läheb säärelihastele.', 'null');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'Ülakehatõsted', 'Klassikaline kõhulihaste harjutus. Jalad kas kuhugi ääre taha kinni, või lihtsalt vastu maad, põlved
                 konksus ja kerite ülakeha algasendist ca 45 kraadi üles ja langetate taas alla tagasi aga nii, et selg ei
                 läheks päris vastu maad, vaid pinge jääks kõhulihastesse. Kordate sama.
                 Põhirõhk selle harjutusega läheb kõhulihaste ülemisele osale.', 'null');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'Jalgade/põlvede tõsted rippes', 'Rippes või rööbaspuudel, tõstate kas sirged jalad(edasijõudnutele) või põlvedest kõverdatuna jalad
                 algasendist üles. Kui põlved siis vastu rinda enamvähem, kui sirged jalad siis horisontaal asendini.
                 Langetate taas kontrollitult algasendisse ja kordate sama.
                 Põhirõhk selle harjutusega läheb kõhulihaste alumisele osale.', 'null');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'Planking', 'Võtate pildil näidatud asendi sisse, et tagumik ei oleks liiga madalal ega liiga kõrgel, panete stopperi
                 käima ja hoiate antud asendit seni kaua kuni suudate. Üritage iga treening progresseeruda hoitud
                 ajaga.
                 Põhirõhk selle harjutusega läheb kõhulihastele ja süvalihastele.','null');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'Jõutõmme kangiga', 'Asetate kangile sobiva raskuse. Seisate kangi taha jalad kuskil õlgade laiuselt või nõks laiemalt. Haarate
                 kangist kahe käega õlgade laiuselt kinni. Lükkate puusad alla ja alaselja nõgusaks (mitte kumeraks !),
                 rinna surute ette, vaatate ja hoiate pea otse ette, mitte maha vaates ja hakkate kangi maast tõmbama
                 esmalt nii, et surute peamiselt jalgadega ja läbi kandade nö. Kui raskus on põlvedest möödas siis
                 lükkate rohkem puusad ette ja tõmbate kangi üles nii, et õlad taha, puusad ja rind ette. Kangi liigutada
                 üles ja alla võimalikult keha lähedalt ! Kindlasti hoida alaselg nõgusalt ja rind ette. Kui alaselg läheb
                 kumeraks, on raskus suur ja vigastused kerged tulema ! Kordate sama.
                 Põhirõhk selle harjutusega läheb tervele seljale + jalgadele.', 'null');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'Istudes laia haardega tõmbed plokil', 'Istute pildil näidatud pingile reied jalatoe all, võtate laiast vardast laialt kinni. Alaselg hoida kindlasti
                 sirgelt või kergelt nõgusalt terve harjutuse vältel, rind ette surutult. Tõmbate varda alla alguses
                 õlgadega ja seljalt abaluud omavahel kokku tõmmates, ehk siis õlad alla ja taha, tõmbate raskuse alla,
                 pea eest ära ja kukla taha nii kaugele, kui tuleb, pingutate hetkeks seljalihaseid maksimaalselt ja lasete
                 raskuse sujuvalt ja kontrollitult üles algasendisse tagasi ja nii, et õlgu krampis ei hoia ja lasete õlgadel
                 üles tõmmata lahti, abaluud laiali ja seljalihast korralikult venitades.
                 Tehke vajalikud kordused, pausid ja seeriad
                 Põhirõhk selle harjutusega läheb selja lailihasele.', 'null');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'Pingil hantli tõmbed küljele', 'Asetate ühe külje jala ja käe pingile nagu pildil näidatud, võtate hantli kätte.Hoides selga sirgelt või
                 kergelt nõgusalt kogu aeg, lasete hantli ette suht vastu maad nii, et tõmbaks abaluud laiali ja tekiks
                 seljalihases korralik venitus ja tõmbate hantli puusa suunas üles, tõmbate abaluud omavahel kokku,
                 pingutate seljalihast max ja langetate taas sujuvalt ja kontrollitult algasendisse tagasi ja samuti suht
                 vastu maad, et tekiks korralik venitus seljalihases. Kordate sama esmalt ühe käega ja seejärel teisega.
                 Põhirõhk selle harjutusega läheb lailihase alaosale ja selja keskosale.', 'null');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'Istudes laia haardega tõmbed', 'Istute pildil näidatud pingile. Jalad asetate alusele, põlvedest veidi kõverdunult. Alaselga hoiate taas
                 nõgusalt ja terve harjutuse vältel, rind ees. Võtate laiast pulgast kahe käega kinni ja tõmbate
                 käepideme rinna alla nii nagu parempoolsel pildil näidatud, et rind oleks ette surutud, küünarnukid ja
                 õlad liiguksid võimalikult taha ja pingutate seljalihast maksimaalselt. Seejärel lasete pulga taas ette,
                 käed kergelt kõverad küünarnukkidest, kuniks tekib seljalihases korralik venitus. Tehke vajalikud
                 kordused, pausid ja seeriad.
                 Põhirõhk selle harjutusega läheb selja ülaosale.', 'null');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'Kitsa haardega tõmbed plokil', 'Istute pildil näidatud pingile reied jalatoe all, võtate kitsast V kujulisest käsikust kinni. Selg hoida
                 kindlasti nõgusalt ja sirgelt terve harjutuse vältel, rind ette surutult ja õlad taga. Tõmbate varda alla
                 alguses õlgadega ja seljalt abaluud omavahel kokku tõmmates, ehk siis õlad alla ja taha, tõmbate
                 raskuse alla, rind nii ette kui läheb ja õlad ja küünarnukid nii taha kui tuleb, pingutate hetkeks
                 seljalihaseid maksimaalselt ja lasete raskuse sujuvalt ja kontrollitult üles algasendisse tagasi ja nii, et
                 õlgu krampis ei hoia ja lasete õlgadel üles tõmmata lahti, abaluud laiali ja seljalihast korralikult
                 venitades. Kordate sama
                 Põhirõhk selle harjutusega läheb selja keskosale ja lailihasele.', 'null');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'Õlakehitused smithil', 'Seisate jalad õlgade laiuselt. Võtate kangist kinni õlgade laiuselt või veidi laiema haardega. Hantlite
                 puhul hantlid keha külgedel. Alaselg sirgelt ja rinna surute ette, tõmbate algasendist alt trapetslihaste
                 jõul sirgete kätega õlad nii üles kui suudate, pingutate hetkeks ja lasete sujuvalt ja raskust kontrollides
                 taas algasendisse välja ja nii, et raskus venitaks veel täiesti alla lihase pikaks ja siis kordate taas sama.
                 Ehk siis maakeeli selline õlakehitus harjutus. Oluline on tõmmata nii üles kui suudate, korra tugev
                 pingutus ja rahulikult alla ja lasta raskusel venitada allasendis õlad alla. Samas peab selg ja keha olema
                 koguaeg sirge, et see ei liiguks edasi tagasi. Ehk selline õlgade kehitus üles alla sirgete kätega. Kordate
                 sama.
                 Põhirõhk selle harjutusega läheb trapetslihasele.', 'null');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'Õlalihased istudes pingil', 'Harjutust võib sooritada nii istudes kui ka seistes, nii hantlite või kangiga, kui ka Smithi pingil. Ükskõik
                 kas seistes või istudes, hoidke jalad õlgade laiuselt, alaselg kindlasti nõgus ja rind suruge ette. Võtke
                 hantlitest või kangist kinni õlgadest veidi laiema haardega. Kui hantlitega sooritate harjutust siis all
                 asendis jäävad hantlid küljele, kui kangiga siis all asendis jääb kang ette rinnale umbes lõua kõrguseni.
                 Sellest asendist surute hantlid/kangi üles ja käed sirgu. Kui hantlitega sooritate siis hantlid jooksevad
                 üleval asendis kokku, mitte kõmm kõmm, vaid liigutus peab olema kaarjas, ehk all asendis on hantlid
                 õlgadest laiema haardega ja üleval võivad kergelt üksteist puudutada. Kangiga suruda lihtsalt kang üles
                 ja natuke taha, et õlalihased sirutuksid korralikult välja. Kordate sama.
                 Põhirõhk selle harjutusega läheb õlalihastele ja triitsepsile.', 'null');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'Facepull', 'Asetate köie plokimasinale ülemisele kinnitusele, võtate köiest kahe käega kinni, astute sammu
                 plokimasinast eemale, et ei hakkaks plokil raskused vastu käima. Seisate jalad õlgade laiuselt, kallutate
                 keha nõks tahapoole, tõstate käed ette üles poole nagu vasakpoolsel pildil näidatud ja tõmbate köie
                 enda näo poole nii kaugele, et jääb vaid grammi jagu silmadest puudu, pingutate tagumisi õla ja ülemisi
                 seljalihaseid hetkeks ja lasete sujuvalt ja raskust kontrollides köie taas algasendisse tagasi. Kordate
                 sama. Põhirõhk selle harjutusega läheb tagumistele õlalihastele ja trapetslihasele.', 'null');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'Istudes/seistes hantlitega lendamine küljele', 'Seisate jalad õlgade laiuselt, võtate hantlid kätte. Selg hoida taas nõgusalt terve harjutuse vältel ja rind
                 ette surutult. Käed hoidke samuti küünarnukkidest veidi kõverdunult, mitte tikksirgelt. Peopesad
                 vaatavad üksteise suunas ja viite käed külgedele üles kuni näo kõrguseni ja langetate taas sujuvalt ja
                 kontrollitult algasendisse tagasi. Kordate sama. Hoidke pöidlaid veidi alla pööratuna nii, et üleval
                 asendis küünarnukid jääksid rusika nukkidest veidi kõrgemale. Ehk siis käe osa õlast küünarnukini,
                 peaks liikuma ilusasti küljelt täpselt üles, mitte viltu või kaldus suunas ja seda saab pöidla keeramisega
                 hästi suunata. Istudes jääb kõik samaks, lihtsalt istute pingile ja toote hantlid küljelt jalgade juurest
                 samamoodi üles näo kõrguseni.
                 Põhirõhk selle harjutusega läheb keskmistele õlalihastele.', 'null');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'Horisontaalpingil kangiga surumine', 'Lamate horisontaalpingil selili, selg vastu pinki ja jalatallad tugevalt maas. Õlad tõmmake taha kokku ja
                 rind suruge ette välja. Võtate kangist kinni õlgadest veidi laiema haardega nagu pildil näidatud. Tõstate
                 kangi pidemetelt üles, langetate sujuvalt ja kontrollitult vastu rinda ca rinnanibude piirile ja tõstate taas
                 üles algasendisse. Käsi üleval tikksirgeks pole vaja lükata, vaid kergelt kõverdunuks jätta. Vältimaks
                 liigset pingestust küünarliigestes ja jättes pideva pinge lihastesse. Kordate sama. Alati kontrollitult kang
                 langetada ja alati vastu rinda ! Käed peaksid jääma keha suhtes ca 45 kraadise nurgaga, ehk siis liiga
                 taha pole mõtet küünarnukke ajada, et ei vigastaks õlgu ja mõju läheks just rinnalihasele rohkem.
                 Põhirõhk selle harjutusega läheb rinnalihastele, õla esiosale ja triitsepsile.', 'null');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'Kaldpingil hantlite või kangiga surumine', 'Võtate reguleeritava pingi ja asetate kaldenurga positiivseks kaldeks ca 20-30 ́. Harjutust saab
                 sooritada hantlitega või kangiga või smithi pingil(kang liigub siinidel). Selg vastu pinki ja jalad maas,
                 võtate kas hantlid või kangi kätte. Haardelaius peaks olema selline, et alla lastes moodustaks käed 90
                 kraadise nurga. Langetate raskuse sujuvalt ja kontrollitult alla, kui kangiga siis vastu rinda kui hantlitega
                 siis nii, et tekiks korralik venitus rinnalihases. Surute taas üles algasendisse jõuga tagasi. Kui hantlitega
                 surute siis surute alt üles diagonaalis nii, et hantlid liiguksid üksteise suunas kokku nagu pildil. Kokku
                 peksta pole vaja plaks plaks aga üksteise suunas ja pingutate lihast korra maksimaalselt. Kordate sama.
                 Põhirõhk selle harjutusega läheb rinnalihaste ülemisele osale ja ka õla esiaosale.','null');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'Pec-Deck masinal/liblikas', 'Istute pildil näidatud masinale, selg vastu pinki ja jalad maas. Suruge rind võimalikult ette ja õlad taha
                 ja abaluud kokku ja nii tuleb hoida terve harjutuse vältel ülakeha. Jälgige, et õlad ei vajuks ette ja
                 ülaselg kaardu, et läheks mõju just rinnalihastele maksimaalselt! Võtate käepidemetest kinni ja
                 tõmbate käed omavahel kokku, hoiate murdosa sekundi ja lasete sujuvalt ja kontrollitult tagasi
                 algasendisse. Kui surute käepidemed ette kokku siis hoidke eriti rind ees ja õlad taga ja käed lõppfaasis
                 suht sirgelt ja mida lähemale küünarnukkide siseosa üksteisele läheb, seda parema pingutuse ka
                 rinnalihases saab. Kui õlad liiguvad ette ja selg kössi siis on raskus liiga suur ja vähendage raskust.
                 Tehke kõik vajalikud kordused, pausid ja tehke kõik seeriad.
                 Põhirõhk selle harjutusega läheb rinnalihaste keskosale.', 'null');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'Prantsuse surumine ', 'Lamage selili horisontaalpingile ja võtke EZ(kõverustega kang nagu pildil näha) kang kätte, tõstke käed
                 üles näo kohale (ideaalis tegelikult mitte otse üles, vaid selline ca 20-30 kraadi taha kaldu ja siis jätta
                 paigale, nii on vähem pinget küünarliigestes ja hoiab rohkem pidevat pinget ka triitsepsis ja lihast töös.
                 Hoides küünarnukkidest õlgadeni käed liikumatuna, langetate käsivarre osa küünarnukkidest
                 randmeteni alla lauba kohale sujuvalt ja kontrollitult ja viite jõulisemalt üles algasendisse tagasi.
                 Kordate sama. PS ! Valige algul kergem raskus ja pidage meeles, et algajatel võib järsult jõud lõppeda,
                 olge ettevaatlikud, et kang ei kukuks vastu pead 
                 PS! Kui see harjutus tundub algul keeruline siis tee järgmise harjutuse mõlemad versioonid hoopis.
                 Tehke vajalikud kordused, pausid ja seeriad.
                 Põhirõhk selle harjutusega läheb triitsepsi kolmele peale.', 'null');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'Plokil pulgaga/köiega allasurumised', 'Seiske plokimasina ees, selg nõgusalt, jalad õlgade laiuselt, võib ka ühte jalga eespool hoida. Hoiate
                 pulgast/köiest kahe käega kinni, käed jällegi küünarvarrest ülespool liikumatult ja viite käsivarred
                 kuniks alla sirgeks välja, lasete aeglaselt ja kontrollitult tagasi ja kordate sama.
                 Maksimaalselt üles ja ka maksimaalselt alla sirgu kindlasti ! Köie puhul suruda allasendis käed
                 üksteisest eemale ehk laiali ja lihas pingule ! Võite teha üks trenn köiega ja teine trenn pulgaga.
                 Tehke vajalikud kordused, pausid ja seeriad.
                 Põhirõhk selle harjutusega läheb triitsepsi kolmele peale.', 'null');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'Seistes kangiga/hantlitega küünarvarte kõverdused', 'Seisate jalad õlgade laiuselt, võtate kangist/hantlitest kinni käed samuti õlgade laiuselt ja käed keha
                 vastas nii, et käte ja keha vahele ei jääks vahet. Selja hoiate nõgusalt terve harjutuse vältel, toote käed
                 küünarvarrest täiesti üles ja langetate sujuvalt ja kontrollitult taas kuni täiesti algasendisse. Pause ei ole
                 vaja teha ei all ega üleval asendis, liikumine sujuv, aga täis amplituudil. Ei mingeid poolikuid liigutusi !
                 Keha ei õõtsu ! Küünarnukid hoida keha lähedal ja võimalikult liikumata !
                 Tehke vajalikud kordused, pausid ja seeriad.
                 Põhirõhk selle harjutusega läheb biitsepsile ja käsivarre lihastele.', 'null');
INSERT INTO public.exercise_template (id, name, description, img_data) VALUES (DEFAULT, 'Istudes pingil hantlitega tõsted', 'Istute seljatoega pingil, seljatugi oleks hea lasta kerge kalde alla, mitte päris tikksirgelt.
                 Võtate hantlid kätte, mõlema käega vaheldumisi, töötava käe keerate alguses ja allasendis risti välja nii,
                 et peopesa jääks suunaga näo poole ja toote käe üles peopesa õla suunas nii kõrgele kui tuleb ja
                 langetate taas sujuvalt alla tagasi kuni algasendini. Jätkate teise käega, keerate samamoodi peopesa
                 näo suunas välja ja kordate sama. Seejärel uuesti teise käega jne kuniks mõlemale käele antud
                 kordused tehtud, tehke vajalikud kordused, pausid ja seeriad.
                 Põhirõhk selle harjutusega läheb biitsepsile ja käsivarre lihastele.', 'null');


INSERT INTO public.muscle_group (id, name) VALUES (DEFAULT, 'Pea');
INSERT INTO public.muscle_group (id, name) VALUES (DEFAULT, 'Keha');
INSERT INTO public.muscle_group (id, name) VALUES (DEFAULT, 'Jalad');
INSERT INTO public.muscle_group (id, name) VALUES (DEFAULT, 'Käed');

INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 1, 1);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 2, 4);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 3, 1);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 4, 1);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 5, 3);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 6, 2);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 7, 3);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 8, 3);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 9, 3);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 10, 3);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 11, 3);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 12, 2);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 13, 2);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 14, 2);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 15, 2);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 15, 3);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 9, 2);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 16, 2);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 16, 4);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 17, 2);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 19, 2);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 19, 4);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 20, 4);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 21, 4);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 22, 4);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 23, 4);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 24, 4);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 24, 2);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 25, 4);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 25, 2);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 26, 2);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 27, 4);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 28, 4);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 29, 4);
INSERT INTO public.exercise_template_muscle_group (id, exercise_template_id, muscle_group_id) VALUES (DEFAULT, 29, 4);

INSERT INTO public.workout_plan (id, name, user_id, status) VALUES (DEFAULT, 'Peagümnastika', 2, 'A');
INSERT INTO public.workout_plan (id, name, user_id, status) VALUES (DEFAULT, 'Keha äratus', 2, 'A');


INSERT INTO public.exercise (id, workout_plan_id, exercise_template_id, reps, sets, weight, status) VALUES (DEFAULT, 1, 1, 12, 3, 0, 'A');
INSERT INTO public.exercise (id, workout_plan_id, exercise_template_id, reps, sets, weight, status) VALUES (DEFAULT, 1, 3, 3, 2, 5, 'A');
INSERT INTO public.exercise (id, workout_plan_id, exercise_template_id, reps, sets, weight, status) VALUES (DEFAULT, 2, 6, 10, 10, 5, 'A');
INSERT INTO public.exercise (id, workout_plan_id, exercise_template_id, reps, sets, weight, status) VALUES (DEFAULT, 2, 2, 10, 10, 5, 'A');
INSERT INTO public.exercise (id, workout_plan_id, exercise_template_id, reps, sets, weight, status) VALUES (DEFAULT, 2, 5, 10, 10, 5, 'A');



