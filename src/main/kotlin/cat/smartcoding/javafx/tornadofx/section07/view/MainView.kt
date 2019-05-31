package cat.smartcoding.javafx.tornadofx.section07.view

import cat.smartcoding.javafx.tornadofx.section07.app.Styles
import tornadofx.*

class MainView : View("Hello TornadoFX") {
    override val root = hbox {
        label(title) {
            addClass(Styles.heading)
        }
    }
}