package tourgambling



import grails.test.mixin.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Country)
class CountryTests {

    void testSomething() {
//        def riders = [['31', 'Cadel', 'Evans', 'Aus'],
//                ['32', 'Brent', 'Bookwalter', 'USA'],
//                ['33', 'Marcus', 'Burghardt', 'Ger'],
//                ['34', 'Philippe', 'Gilbert', 'Bel'],
//                ['35', 'Amael', 'Moinard', 'Fra'],
//                ['36', 'Steve', 'Morabito', 'Sui'],
//                ['37', 'Manuel', 'Quinziato', 'Ita'],
//                ['38', 'Michael', 'Schar', 'Sui'],
//                ['39', 'Tejay', 'van Garderen', 'USA']]

//        def riders = [['11', 'Peter', 'Sagan', 'Svk'],
//                ['12', 'Maciej', 'Bodnar', 'Pol'],
//                ['13', 'Alessandro', 'De Marchi', 'Ita'],
//                ['14', 'Ted', 'King', 'USA'],
//                ['15', 'Kristijan', 'Koren', 'Slo'],
//                ['16', 'Alan', 'Marangoni', 'Ita'],
//                ['17', 'Moreno', 'Moser', 'Ita'],
//                ['18', 'Fabio', 'Sabatini', 'Ita'],
//                ['19', 'Brian', 'Vandborg', 'Den']]

//        def riders = [['21','Jurgen','Van den Broeck','Bel'],
//                ['22','Lars','Bak','Den'],
//                ['23','Bart','De Clercq','Bel'],
//                ['24','Andre','Greipel','Ger'],
//                ['25','Adam','Hansen','Aus'],
//                ['26','Greg','Henderson','NZl'],
//                ['27','Jurgen','Roelandts','Bel'],
//                ['28','Marcel','Sieberg','Ger'],
//                ['29','Frederik','Willems','Bel']]


//          def riders = [['1', 'Chris','Froome','GBr'],
//                  ['2', 'Edvald','Boasson Hagen','Nor'],
//                  ['3', 'Peter','Kennaugh','GBr'],
//                  ['4', 'Vasil','Kiryienka','Blr'],
//                  ['5', 'David','Lopez','Spa'],
//                  ['6', 'Richie','Porte','Aus'],
//                  ['7', 'Kanstantsin','Siutsou','Blr'],
//                  ['8', 'Ian','Stannard','GBr'],
//                  ['9', 'Geraint','Thomas','GBr']]

//        def riders = [['41','Andy','Schleck','Lux'],
//                ['42','Jan','Bakelants','Bel'],
//                ['43','Laurent','Didier','Lux'],
//                ['44','Tony','Gallopin','Fra'],
//                ['45','Markel','Irizar','Spa'],
//                ['46','Andreas','Kloden','Ger'],
//                ['47','Maxime','Monfort','Bel'],
//                ['48','Jens','Voigt','Ger'],
//                ['49','Haimar','Zubeldia','Spa']]

//        def riders = [['51','Pierre','Rolland','Fra'],
//                ['52','Yukiya','Arashiro','Jap'],
//                ['53','Jerome','Cousin','Fra'],
//                ['54','Cyril','Gautier','Fra'],
//                ['55','Yohann','Gene','Fra'],
//                ['56','Davide','Malacarne','Ita'],
//                ['57','Kevin','Reza','Fra'],
//                ['58','David','Veilleux','Can'],
//                ['59','Thomas','Voeckler','Fra']]

//        def riders = [['61','Janez','Brajkovic','Svk'],
//                ['62','Assan','Bazayev','Kaz'],
//                ['63','Jakob','Fuglsang','Den'],
//                ['64','Enrico','Gasparotto','Ita'],
//                ['65','Francesco','Gavazzi','Ita'],
//                ['66','Andrey','Kashechkin','Kaz'],
//                ['67','Fredrik','Kessiakoff','Swe'],
//                ['68','Alexey','Lutsenko','Kaz'],
//                ['69','Dmitri','Muravyev','Kaz']]


//        def riders = [['71','Thibaut','Pinot','Fra'],
//                ['72','William','Bonnet','Fra'],
//                ['73','Nacer','Bouhanni','Fra'],
//                ['74','Pierrick','Fedrigo','Fra'],
//                ['75','Murilo','Fischer','Bra'],
//                ['76','Alexandre','Geniez','Fra'],
//                ['77','Arnold','Jeannesson','Fra'],
//                ['78','Jeremy','Roy','Fra'],
//                ['79','Arthur','Vichot','Fra']]

//        def riders = [['81','Jean-Christophe','Peraud','Fra'],
//                    ['82','Romain','Bardet','Fra'],
//                    ['83','Maxime','Bouet','Fra'],
//                    ['84','Samuel','Dumoulin','Fra'],
//                    ['85','Hubert','Dupont','Fra'],
//                    ['86','John','Gadret','Fra'],
//                    ['87','Blel','Kadri','Fra'],
//                    ['88','Sebastien','Minard','Fra'],
//                    ['89','Christophe','Riblon','Fra']]


          def riders = [['91','Alberto','Contador','Esp'],
                  ['92','Daniele','Bennati','Ita'],
                  ['93','Jesus','Hernandez','Esp'],
                  ['94','Roman','Kreuziger','Cze'],
                  ['95','Benjamin','Noval','Esp'],
                  ['96','Sergio','Paulinho','Por'],
                  ['97','Nicolas','Roche','Irl'],
                  ['98','Michael','Rogers','Aus'],
                  ['99','Matteo','Tosatto','Ita']]


//        def riders =[['101','Joaquim','Rodriguez','Esp'],
//                ['102','Pavel','Brutt','Rus'],
//                ['103','Alexander','Kristoff','Nor'],
//                ['104','Aliaksandr','Kuchynski','Blr'],
//                ['105','Alberto','Losada','Spa'],
//                ['106','Daniel','Moreno','Spa'],
//                ['107','Gatis','Smukulis','Lat'],
//                ['108','Yuriy','Trofimov','Rus'],
//                ['109','Eduard','Vorganov','Rus']]



//        def someFile = new File("D:\\IProjects\\tourGambling\\grails-app\\conf\\sql\\rawRiderList.txt").text;
//        println "this many lines ${someFile.readLines().size()}"

        new File("D:\\IProjects\\tourGambling\\grails-app\\conf\\sql\\rawRiderList.txt").text.eachLine{ line ->
            println "here is a line ${line}"
        }

        riders.each { rider ->
            println "insert into rider (bib_number, version, first_name, last_name, team_id, nationality_id) values (${rider[0]}, 0,'${rider[1]}','${rider[2]}',(select id from team where name = 'Saxo-Tinkoff'),(select id from country where abbreviation = UPPER('${rider[3]}')));"
        }



        fail "Implement me"
    }
}
