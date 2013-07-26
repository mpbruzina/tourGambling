package util

/**
 * Created with IntelliJ IDEA.
 * User: mikebruzina
 * Date: 7/26/13
 * Time: 4:09 PM
 * To change this template use File | Settings | File Templates.
 */
class SqlInsertBuilder {


    def buildRiderInserts(){

        def riders = [['31','Cadel','Evans','Aus'],
                ['32','Brent','Bookwalter','USA'],
                ['33','Marcus','Burghardt','Ger'],
                ['34','Philippe','Gilbert','Bel'],
                ['35','Amael','Moinard','Fra'],
                ['36','Steve','Morabito','Sui'],
                ['37','Manuel','Quinziato','Ita'],
                ['38','Michael','Schar','Sui'],
                ['39','Tejay','van Garderen','USA']]



        riders.each {rider ->
            println "insert into riders (id, firstName, lastName, teamId, cntyId) values (${rider[0]},${rider[1]},${rider[2]},(select id from teams where name = 'BMC Racing Team'),(select id from country where abbr = UPPER(${rider[3]}));"
        }

    }

}
