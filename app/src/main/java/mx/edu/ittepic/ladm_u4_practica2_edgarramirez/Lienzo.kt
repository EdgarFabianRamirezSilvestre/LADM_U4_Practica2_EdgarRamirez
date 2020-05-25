package mx.edu.ittepic.ladm_u4_practica2_edgarramirez

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Lienzo(p: MainActivity) : View(p) {

    var dia = true
    var posicionX = 150f

    override fun onDraw(canvas : Canvas) {

        var paint = Paint()

        if(dia) {
            // CIELO AZUL DE DIA
            canvas.drawColor(Color.rgb(173,241,255))

            // SOL
            var sol = FiguraGeometrica(0, 0, 200)
            paint.color = Color.rgb(242,255,37)
            sol.pintar(canvas, paint)

            // PASTO DIA
            var pasto = FiguraGeometrica(0,1000,1200,1500)
            paint.color = Color.rgb(137,244,29)
            pasto.pintar(canvas,paint)

            // NUBE
            var nube1 = FiguraGeometrica(450, 150, 60)
            var nube2 = FiguraGeometrica(520, 150, 60)
            var nube3 = FiguraGeometrica(570, 150, 60)
            paint.color = Color.rgb(255, 255, 255)
            nube1.pintar(canvas, paint)
            nube2.pintar(canvas, paint)
            nube3.pintar(canvas, paint)

        } else {
            // CIELO AZUL DE NOCHE
            canvas.drawColor(Color.rgb(26,72,82))

            // LUNA
            var sol = FiguraGeometrica(0, 0, 200)
            paint.color = Color.rgb(213,217,218)
            sol.pintar(canvas, paint)

            // PASTO NOCHE
            var pasto = FiguraGeometrica(0,1000,1200,1500)
            paint.color = Color.rgb(35,100,8)
            pasto.pintar(canvas,paint)

            // PUNTOS DE ESTRELLAS
            paint.color = Color.rgb(213,217,218)
            paint.style = Paint.Style.FILL
            canvas.drawCircle(90f, 332f, 5f, paint)
            canvas.drawCircle(120f, 452f, 5f, paint)
            canvas.drawCircle(155f, 932f, 5f, paint)
            canvas.drawCircle(250f, 302f, 5f, paint)
            canvas.drawCircle(310f, 462f, 5f, paint)
            canvas.drawCircle(525f, 342f, 5f, paint)
            canvas.drawCircle(625f, 242f, 5f, paint)
            canvas.drawCircle(715f, 562f, 5f, paint)
            canvas.drawCircle(615f, 192f, 5f, paint)
            canvas.drawCircle(625f, 862f, 5f, paint)
            canvas.drawCircle(415f, 258f, 5f, paint)
            canvas.drawCircle(515f, 532f, 5f, paint)
            canvas.drawCircle(310f, 252f, 5f, paint)
            canvas.drawCircle(50f, 532f, 5f, paint)
            canvas.drawCircle(40f, 252f, 5f, paint)
            canvas.drawCircle(500f, 50f, 5f, paint)
            canvas.drawCircle(400f, 60f, 5f, paint)

        }//else

        // ARBOL1
        var tronco = FiguraGeometrica(80, 920, 100, 180)
        var hojas = FiguraGeometrica(130, 930, 80)
        var hojas1 = FiguraGeometrica(130, 830, 80)
        paint.color = Color.rgb(88, 44, 20)
        tronco.pintar(canvas, paint)
        paint.color = Color.rgb(15, 95, 16)
        hojas.pintar(canvas, paint)
        hojas1.pintar(canvas, paint)

        // ARBOL2
        var tronco2 = FiguraGeometrica(530, 920, 100, 180)
        var hojas2 = FiguraGeometrica(580, 930, 80)
        var hojas3 = FiguraGeometrica(580, 830, 80)
        paint.color = Color.rgb(88, 44, 20)
        tronco2.pintar(canvas, paint)
        paint.color = Color.rgb(15, 95, 16)
        hojas2.pintar(canvas, paint)
        hojas3.pintar(canvas, paint)

        // HELICOPTERO
        canvas.drawBitmap(BitmapFactory.decodeResource(resources, R.drawable.helicoptero), posicionX, 350f, paint)

    }//onDraw
}//Lienzo