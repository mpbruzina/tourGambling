package tourgambling

import groovy.sql.Sql

class UberDbService {

    def sql = Sql.newInstance( 'jdbc:h2:mem:devDb;MVCC=TRUE', 'sa', '', 'org.h2.Driver' )

    def fetchAllTeams() {
        sql.rows('select id, name, country_id from team order by name asc')
    }

    def fetchRidersForTeam(def teamId){
        sql.rows('select first_name, last_name from rider where team_id = ?', teamId)
    }

}
