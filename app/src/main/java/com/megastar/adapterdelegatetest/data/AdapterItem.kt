package com.megastar.adapterdelegatetest.data

interface  AdapterItem {
    fun getViewType(): Int

    companion object {
        fun getItems(): MutableList<AdapterItem> {
            return mutableListOf<AdapterItem>().apply {
                add(AnimalModel("Собака", "https://i.pinimg.com/564x/44/ca/e6/44cae61c24363e3794d6a507ca429784.jpg"))
                add(AnimalModel("Кошка","https://i.ytimg.com/vi/XjTbISe5fnE/hqdefault.jpg"))
                add(MovieModel("Карты, деньги, два ствола",3.5f))
                add(MovieModel("Свадебная ваза",5f))
                add(MovieModel("Зеленый слоник",4.5f))
                add(ColorModel("Меняем цвет",178))
                add(ColorModel("Ещё меняем цвет",125))

                add(NewsModel("Человек по имени Иисус спас участника марафона, одетого в манишку «Иисус спасает»","В Миннеаполисе (США) 43-летний помощник анестезиолога по имени Хесус Буэно спас 25-летнего Тайлера Муна, который бежал в манишке с надписью «Иисус спасает»."))
                add(NewsModel("Кот-наркокурьер сбежал из тульской колонии до суда","Из зооуголка в колонии №6 Тульской области сбежал кот, который по версии следствия был орудием передачи наркотиков в колонию. Безымянного кота признали вещдоком. Как пишет «Коммерсантъ», без него дело может быть закрыто. По версии обвинения, заключённый колонии №6 Эдуард Долгинцев с помощью кота организовал поставку наркотиков в колонию с воли. Хищник, родившийся в колонии, якобы иногда покидал её территорию через лаз в заборе. По версии обвинения, в июле 2018 года знакомый Эдуарда надел на кота ошейник с тайным кармашком и положил в него наркотики."))
                shuffle()
            }

        }
    }
}