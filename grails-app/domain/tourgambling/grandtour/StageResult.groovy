package tourgambling.grandtour

import groovy.time.TimeDuration
import tourgambling.Rider

class StageResult {

    static constraints = {
    }

    Stage stage
    Rider rider
    //want to use groovy.time.TimeDuration, but hibernate bitched on startup
    //TimeDuration totalTime
    //TimeDuration gap
    Date totalTime
    Date gap
    int rank
}
