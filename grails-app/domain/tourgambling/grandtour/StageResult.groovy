package tourgambling.grandtour

import groovy.time.TimeDuration
import tourgambling.Rider

class StageResult {

    static constraints = {
    }

    Stage stage
    Rider rider
    TimeDuration totalTime
    TimeDuration gap
}
