package tourgambling.grandtour

import groovy.time.TimeDuration

class Stage {

    static constraints = {
    }

    int stageId
    String startLocation
    String endLocation
    float distance
    TimeDuration winningTime
    def results = []
}
