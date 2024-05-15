package com.example.roomapp.data.mockData

import com.example.roomapp.domain.models.Heroe

class MockData {
    companion object{
        val heroe = listOf<Heroe>(
            Heroe(1, "Thor",1,"https://lumiere-a.akamaihd.net/v1/images/thor_amor_y_trueno_3cc74888.jpeg?region=420,0,1080,1080", "Tiene un martillo super pesado, que solamente el puede cargar"),
            Heroe(2, "Iron Man", 1, "https://sm.ign.com/ign_es/news/m/marvels-ir/marvels-iron-man-vr-new-combat-world-details-revealed_sbmy.jpg","Tiene un traje que le permite volar, disparar, hacer muchas cosas"),
            Heroe(3, "Spiderman", 1, "https://i.blogs.es/c7ed10/screenshot_90/1366_2000.jpeg","Puede escalar, lanzar telarañas"),
            Heroe(4, "Black Panther", 1,"https://i.pinimg.com/736x/71/ff/f3/71fff3f1373aa0105e59d0a62b325ee4.jpg", "Tiene muchod reflejos, fuerza sobrehumana"),
            Heroe(5, "Hulk", 1, "https://static.wikia.nocookie.net/disney/images/b/b9/Profile_-_Hulk.jpg/revision/latest?cb=20210910150705&path-prefix=es","Se convierte en una personota enorme de color verde muy fuerte"),
            Heroe(6, "Batman", 2, "https://bandai.com.mx/blog/wp-content/uploads/2019/09/Historia-de-Batman-el-superhe%CC%81roe-ma%CC%81s-popular-en-la-era-digital-copia-1.jpg","Puede volar tiene una capa negra y es muy fuerte"),
            Heroe(7, "Flash", 2, "https://i.blogs.es/c883f0/the-flash-hbo-max-mexico/840_560.jpeg","Es el mas rapido de todos, imposible de ver"),
            Heroe(8, "Superman", 2, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS34rkbPmB54RNoberg2J0A9H5-HOKUH-k3dm09JRL6aA&s","Es fuerte y puede volar, ademas de que es atractivo"),
            Heroe(9, "Wonder Woman", 2, "https://static.wikia.nocookie.net/dccu/images/6/6f/JL_Wonder_Woman.jpg/revision/latest?cb=20160914003449","Es muy fuerte, tiene una velocidad Inmortal, se cura sola"),
            Heroe(10, "Aquaman", 2, "https://img.asmedia.epimg.net/resizer/v2/QQHNBSPTSFM7LCM4XUQ35NLOSE.jpg?auth=67509b945fccf28a46376f26ee352c41765cdd702c44167106ec505b0d9f239c&width=1200&height=1200&smart=true","Se adapta al agua y se puede cuarar solo"),
        )
    }
}