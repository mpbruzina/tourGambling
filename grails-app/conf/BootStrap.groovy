import groovy.sql.Sql
import tourgambling.Country

class BootStrap {

    def dataSource

    def init = { servletContext ->
        def sql = new Sql(dataSource)



        //this works (as it should) using GORM...adds the ID and Version implicitly
//        new Country(name:"United States",abbreviation:"USA",flag:"/img/flags/flag.jpg").save()
//        new Country(name:"Great Britain",abbreviation:"GBR",flag:"/img/flags/flag.jpg").save()
//        new Country(name:"Spain",abbreviation:"ESP",flag:"/img/flags/flag.jpg").save()
//        new Country(name:"Italy",abbreviation:"ITA",flag:"/img/flags/flag.jpg").save()
//        new Country(name:"Portugal",abbreviation:"POR",flag:"/img/flags/flag.jpg").save()
//        new Country(name:"Luxembourg",abbreviation:"LUX",flag:"/img/flags/flag.jpg").save()
//        new Country(name:"Switzerland",abbreviation:"SUI",flag:"/img/flags/flag.jpg").save()
//        new Country(name:"Germany",abbreviation:"GER",flag:"/img/flags/flag.jpg").save()
//        new Country(name:"Netherlands",abbreviation:"NED",flag:"/img/flags/flag.jpg").save()
//        new Country(name:"Slovakia",abbreviation:"SVK",flag:"/img/flags/flag.jpg").save()
//        new Country(name:"Australia",abbreviation:"AUS",flag:"/img/flags/flag.jpg").save()
//        new Country(name:"Austria",abbreviation:"AUT",flag:"/img/flags/flag.jpg").save()
//
//        sql.executeInsert("""insert into country (version, name, abbreviation, flag) values (0, 'CrapData','CRP','flag.jpg')""")




//        insert into country (id, name, abbr, flagImgUrl) values (id , 'Portugal','POR','/img/flags/flag.jpg');
//        insert into country (id, name, abbr, flagImgUrl) values (id , 'Luxembourg','LUX','/img/flags/flag.jpg');
//        insert into country (id, name, abbr, flagImgUrl) values (id , 'Switzerland','SUI','/img/flags/flag.jpg');
//        insert into country (id, name, abbr, flagImgUrl) values (id , 'Germany','GER','/img/flags/flag.jpg');
//        insert into country (id, name, abbr, flagImgUrl) values (id , 'Netherlands','NED','/img/flags/flag.jpg');
//        insert into country (id, name, abbr, flagImgUrl) values (id , 'Slovakia','SVK','/img/flags/flag.jpg');
//        insert into country (id, name, abbr, flagImgUrl) values (id , 'Australia','AUS','/img/flags/flag.jpg');
//        insert into country (id, name, abbr, flagImgUrl) values (id , 'Austria','AUT','/img/flags/flag.jpg');
    }
    def destroy = {
    }
}
