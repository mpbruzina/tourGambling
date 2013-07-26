package tourgambling



import grails.test.mixin.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Country)
class CountryTests {

    void testSomething() {
        def riders = [['31', 'Cadel', 'Evans', 'Aus'],
                ['32', 'Brent', 'Bookwalter', 'USA'],
                ['33', 'Marcus', 'Burghardt', 'Ger'],
                ['34', 'Philippe', 'Gilbert', 'Bel'],
                ['35', 'Amael', 'Moinard', 'Fra'],
                ['36', 'Steve', 'Morabito', 'Sui'],
                ['37', 'Manuel', 'Quinziato', 'Ita'],
                ['38', 'Michael', 'Schar', 'Sui'],
                ['39', 'Tejay', 'van Garderen', 'USA']]

        riders.each { rider ->
            println "insert into riders (id, firstName, lastName, teamId, cntyId) values (${rider[0]},'${rider[1]}','${rider[2]}',(select id from teams where name = 'BMC Racing Team'),(select id from country where abbr = UPPER('${rider[3]}'));"
        }



        fail "Implement me"
    }
}
