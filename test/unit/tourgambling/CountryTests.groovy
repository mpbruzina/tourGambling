package tourgambling

import grails.test.mixin.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Country)
class CountryTests {

    void testSomething() {

        println """
insert into country (version, name, abbreviation, flag) values (0,'United States','USA','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'Great Britain','GBR','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'Spain','ESP','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'Italy','ITA','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'Portugal','POR','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'Luxembourg','LUX','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'Switzerland','SUI','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'Germany','GER','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'Netherlands','NED','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'Slovakia','SVK','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'Australia','AUS','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'Austria','AUT','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'France','FRA','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'Denmark','DEN','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'Russia','RUS','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'Belgium','BEL','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'Kazahkstan','KAZ','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'New Zealand','NZL','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'Poland','POL','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'Canada','CAN','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'Japan','JAP','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'Sweden','SWE','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'Brasil','BRA','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'Czech Republic','CZE','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'Norway','NOR','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'Latvia','LAT','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'Belarus','BLR','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'Ireland','IRL','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'Estonia','EST','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'Lithuania','LTU','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'South Africa','RSA','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'Uzbekistan','UZB','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'Colombia','COL','/img/flags/flag.jpg');
insert into country (version, name, abbreviation, flag) values (0,'Costa Rica','CRC','/img/flags/flag.jpg');
"""

        def teamName

        new File("D:\\IProjects\\tourGambling\\grails-app\\conf\\sql\\rawRiderList.txt").text.eachLine { line ->
            def rider = line.split()

            if (!rider[0].isInteger()) {
                teamName = ""
                def country = rider[rider.size() - 1].replace('(', '').replace(')', '').toUpperCase()
                if ('SPA'.equals(country))
                    country = 'ESP'

                for (int i = 0; i < rider.size() - 1; i++) {

                    teamName += " ${rider[i]}"
                }


                println "insert into team (version, name, country_id) values (0, '${teamName.trim()}',(select id from country where abbreviation = '${country}')); "

            } else {
                if (rider.size() == 4) {
                    def country = rider[rider.size() - 1].replace('(', '').replace(')', '').toUpperCase()
                    if ('SPA'.equals(country))
                        country = 'ESP'
                    if ('SLO'.equals(country))
                        country = 'SVK'

                    println "insert into rider (bib_number, version, first_name, last_name, team_id, nationality_id) values (${rider[0]}, 0,'${rider[1]}','${rider[2]}',(select id from team where name = '${teamName.trim()}'),(select id from country where abbreviation = UPPER('${country}')));"
                } else {
                }
            }
            fail "Implement me"
        }
    }
}