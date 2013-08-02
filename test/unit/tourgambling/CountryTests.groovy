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

        def riders = [['21','Jurgen','Van den Broeck','Bel'],
                ['22','Lars','Bak','Den'],
                ['23','Bart','De Clercq','Bel'],
                ['24','Andre','Greipel','Ger'],
                ['25','Adam','Hansen','Aus'],
                ['26','Greg','Henderson','NZl'],
                ['27','Jurgen','Roelandts','Bel'],
                ['28','Marcel','Sieberg','Ger'],
                ['29','Frederik','Willems','Bel']]

        riders.each { rider ->
            println "insert into riders (id, firstName, lastName, teamId, cntyId) values (${rider[0]},'${rider[1]}','${rider[2]}',(select id from teams where name = 'Lotto-Belisol'),(select id from country where abbr = UPPER('${rider[3]}'));"
        }



        fail "Implement me"
    }
}
