package tourgambling.grandtour

import groovy.time.TimeDuration

class Stage {

    static constraints = {
    }

    int stageId
    String startLocation
    String endLocation
    float distance
    //want to use groovy.time.TimeDuration, but hibernate bitched on startup
    Date winningTime
    def results = []
}
