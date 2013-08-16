package tourgambling

class UberController {

    def uberDbService;

    def index() {
        def teams = uberDbService.fetchAllTeams()

        [teams:teams]
    }

//    def ajaxFetchRiders(def teamId){
//        def riders = uberDbService.fetchRidersForTeam(teamId)
//        render riders as JSON
//    }
}
