package com.xsergiodm

import io.github.palexdev.materialfx.css.themes.MFXThemeManager
import io.github.palexdev.materialfx.css.themes.Themes
import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage
import javafx.stage.StageStyle

class Run: Application() {
    override fun start(primaryStage: Stage?) {

        val fxmlLoader = FXMLLoader(Run::class.java.getResource("/com/xsergiodm/view/Manager_view.fxml"))

        val style = Run::class.java.getResource("/com/xsergiodm/style/Manager_style.css")?.toExternalForm()

        val escena = fxmlLoader.load<javafx.scene.Parent>()
        escena.stylesheets.add(style)

        MFXThemeManager.addOn(escena, Themes.DEFAULT,Themes.LEGACY)


        primaryStage?.scene = Scene(escena)
        primaryStage?.show()
    }
}
fun main() {
    Application.launch(Run::class.java)
}