package com.xsergiodm.controller

import io.github.palexdev.materialfx.css.themes.MFXThemeManager
import io.github.palexdev.materialfx.css.themes.Themes
import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.Alert
import javafx.scene.control.Button
import javafx.scene.control.MenuItem
import javafx.stage.Stage

class Manager_controller {

    @FXML
    private lateinit var btInfo: Button

    @FXML
    private lateinit var miCerrarSesion: MenuItem

    @FXML
    private lateinit var miSalir: MenuItem

    @FXML
    fun cerrarSesion(event: ActionEvent) {
        val stage = btInfo.scene.window as Stage
        stage.close()
        val stage2 = Stage()
        val root = FXMLLoader.load<Parent>(javaClass.getResource("/com/xsergiodm/view/Longin_view.fxml"))
        val scene = Scene(root)
        scene.stylesheets.add("/com/xsergiodm/style/Login_style.css")
        MFXThemeManager.addOn(scene, Themes.DEFAULT, Themes.LEGACY)
        stage2.scene = scene
        stage2.title = "Login"
        stage2.show()
    }

    @FXML
    fun informacion(event: ActionEvent) {
        val alerta = Alert(Alert.AlertType.INFORMATION)
        alerta.title = "INFORMACIÓN"
        alerta.headerText = "Información de contacto del creador"
        alerta.contentText = "Creado por: Sergio Danilo Mosquera Quigua\n" +
                "Correo: sergiodanilomosqueraquigua@gmail.com\n" +
                "Teléfono: 310 234 0024\n" +
                "GitHub: XSERGIODM"
        alerta.showAndWait()
    }

    @FXML
    fun salir(event: ActionEvent) {
        val stage = this.btInfo.scene.window as Stage
        stage.close()
    }

}

