package net.blusutils

private const val CatCardDesc =
    "Это кошкокарта! Сама по себе она ничего не делает. Сыграй ДВУХ {CCARD}, чтобы украсть случайную карту соперника!"
private const val EmptyImage = "..."

private const val Shf = "Затасуй"
private const val ShfDesc = "Перетасуй колоду"

private const val Stf = "Посмуртри грядущее"
private const val StfDesc = "Подсмотри первые три карты, но не показывай другим"

private const val Favor = "Подлижись"
private const val FavorDesc = "Попроси соперника дать тебе карту по его выбору"

private const val Pass = "Слиняй"
private const val PassDesc = "Заверши свой ход и не бери карту"

private const val Attack = "Нападай"
private const val AttackDesc = "Заверши свой ход и бери карту. Следующий игрок ходит дважды."

private const val Nope = "Неть!"
private const val NopeDesc = "Отмени действие карты соперника. Можешь сыграть даже не в свой ход."

private const val Defuse = "Обезвредь"
private const val DefuseDesc = "Ты не взрываешься! Вместо этого верни последнюю карту в колоду, но не показывая другим игрокам."

private const val ExK = "Взрывной котенок"
private const val ExKDesc = "Немедленно покажи эту карту"

fun String.U(new: String) = replace("{CCARD}", new)

enum class CardType {
    Cat,
    Shuffle,
    Favor,
    SeeTheFuture,
    Pass,
    Attack,
    Nope,
    Defuse,
    ExplodingKitten
}

data class CardSkin(
    val type: CardType,
    val name: String,
    val image: String,
    val message: String,
    val extra: String,
)

typealias C = CardSkin

val kittens = arrayOf(
    C(
        CardType.ExplodingKitten,
        ExK,
        EmptyImage,
        "сгрыз динамит...",
        ExKDesc
    ),
    C(
        CardType.ExplodingKitten,
        ExK,
        EmptyImage,
        "прогулялся по пульту от ядерных ракет...",
        ExKDesc
    ),
    C(
        CardType.ExplodingKitten,
        ExK,
        EmptyImage,
        "уснул на атомном реакторе...",
        ExKDesc
    ),
    C(
        CardType.ExplodingKitten,
        ExK,
        EmptyImage,
        "сделал 'кусь' гранате...",
        ExKDesc
    )
)

val defuse = arrayOf(
    C(
        CardType.Defuse,
        Defuse,
        EmptyImage,
        "лазерной указкой",
        DefuseDesc
    ),
    C(
        CardType.Defuse,
        Defuse,
        EmptyImage,
        "бутерами с валерианой",
        DefuseDesc
    ),
    C(
        CardType.Defuse,
        Defuse,
        EmptyImage,
        "позой котоса",
        DefuseDesc
    ),
    C(
        CardType.Defuse,
        Defuse,
        EmptyImage,
        "ночными шептунами",
        DefuseDesc
    ),
    C(
        CardType.Defuse,
        Defuse,
        EmptyImage,
        "сеансом у Зигмуррда Фрейда",
        DefuseDesc
    ),
    C(
        CardType.Defuse,
        Defuse,
        EmptyImage,
        "почесыванием пузика",
        DefuseDesc
    )
)

// кошкокарты
val catcards = arrayOf(
    C(
        CardType.Cat,
        "Такокат",
        EmptyImage,
        "С отборной шерстью!",
        CatCardDesc.U("Такокатов")
    ),
    C(
        CardType.Cat,
        "Кошкарбуз",
        EmptyImage,
        "Тьпху!!",
        CatCardDesc.U("Кошкарбузов")
    ),
    C(
        CardType.Cat,
        "Ня-кот НАОБОРОТ",
        EmptyImage,
        "БУЭЭЭЭ!",
        CatCardDesc.U("Ня-котов")
    ),
    C(
        CardType.Cat,
        "Бородокот",
        EmptyImage,
        "",
        CatCardDesc.U("Бородокотов")
    ),
    C(
        CardType.Cat,
        "Волосатая кошка-картошка",
        EmptyImage,
        "",
        CatCardDesc.U("Кошек-картошек")
    ),
)

val deck = listOf(
    *catcards, *catcards, *catcards, *catcards,
    // затасуй-карты
    C(
        CardType.Shuffle,
        Shf,
        EmptyImage,
        "Материализуется межпространственный кошачий лоток!",
        ShfDesc
    ),
    C(
        CardType.Shuffle,
        Shf,
        EmptyImage,
        "Ураган Котрин обрушился на Шпицберген!",
        ShfDesc
    ),
    C(
        CardType.Shuffle,
        Shf,
        EmptyImage,
        "Абракраб Линкольн избран презедентом!",
        ShfDesc
    ),
    C(
        CardType.Shuffle,
        Shf,
        EmptyImage,
        "Пердящие летучие мыши сходят с небес!",
        ShfDesc
    ),

    // подлижись
    C(
        CardType.Favor,
        Favor,
        EmptyImage,
        "Попросись потереть спинку",
        FavorDesc
    ),
    C(
        CardType.Favor,
        Favor,
        EmptyImage,
        "Бородозди океан на своей бородолодке",
        FavorDesc
    ),
    C(
        CardType.Favor,
        Favor,
        EmptyImage,
        "Продайся в рабство тусобелкам",
        FavorDesc
    ),
    C(
        CardType.Favor,
        Favor,
        EmptyImage,
        "Намажь пупок арахисовым маслом и заведи новых друзей",
        FavorDesc
    ),

    // подсмуртри
    C(
        CardType.SeeTheFuture,
        Stf,
        EmptyImage,
        "Почеши пузо свинорога",
        StfDesc
    ),
    C(
        CardType.SeeTheFuture,
        Stf,
        EmptyImage,
        "Спроси у всезнающего каркозлика",
        StfDesc
    ),
    C(
        CardType.SeeTheFuture,
        Stf,
        EmptyImage,
        "Пошли спецназайцев",
        StfDesc
    ),
    C(
        CardType.SeeTheFuture,
        Stf,
        EmptyImage,
        "Призови рака-оракула",
        StfDesc
    ),
    C(
        CardType.SeeTheFuture,
        Stf,
        EmptyImage,
        "Перекуси единорожьей шаурмой. Да прибудет с тобой шаурмячья сила!",
        StfDesc
    ),

    // слиняй
    C(
        CardType.Pass,
        Pass,
        EmptyImage,
        "Примерь съемный зад гепарда",
        PassDesc
    ),
    C(
        CardType.Pass,
        Pass,
        EmptyImage,
        "Погарцуй на тираннозайце",
        PassDesc
    ),
    C(
        CardType.Pass,
        Pass,
        EmptyImage,
        "Полети на козлическом корабле",
        PassDesc
    ),
    C(
        CardType.Pass,
        Pass,
        EmptyImage,
        "Крабуй отсюда",
        PassDesc
    ),

    // нападай
    C(
        CardType.Attack,
        Attack,
        EmptyImage,
        "Разбуди медведактиля",
        AttackDesc
    ),
    C(
        CardType.Attack,
        Attack,
        EmptyImage,
        "Запусти из крабопульты",
        AttackDesc
    ),
    C(
        CardType.Attack,
        Attack,
        EmptyImage,
        "Пробуди древние волосы на спине",
        AttackDesc
    ),
    C(
        CardType.Attack,
        Attack,
        EmptyImage,
        "Спусти с цепи бармакота",
        AttackDesc
    ),

    // неть
    C(
        CardType.Nope,
        Nope,
        EmptyImage,
        "Умчи меня, лесной кролень!",
        NopeDesc
    ),
    C(
        CardType.Nope,
        Nope,
        EmptyImage,
        "Накорми соперника нетьбургером с нетьчупом",
        NopeDesc
    ),
    C(
        CardType.Nope,
        Nope,
        EmptyImage,
        "Неть-ниндзя дает с вертушки по ушкам",
        NopeDesc
    ),
    C(
        CardType.Nope,
        Nope,
        EmptyImage,
        "Выиграй Нетьбелевскую премию мура",
        NopeDesc
    ),
    C(
        CardType.Nope,
        Nope,
        EmptyImage,
        "Нетьстрадамус глаголит истину!",
        NopeDesc
    )
)


fun main() {
    val players = 3
    require(players in 2..5)

    require((deck + defuse + kittens).size == 56)

    val cards = deck.toMutableList().shuffled()
    val defuses = defuse.toMutableList().shuffled().take(players)

//    println("nopes = ${cards.count { it.type == CardType.Nope }}")
//    println("attacks = ${cards.count { it.type == CardType.Attack }}")
//    println("favor = ${cards.count { it.type == CardType.Favor }}")
//    println("stf = ${cards.count { it.type == CardType.SeeTheFuture }}")
//    println("pass = ${cards.count { it.type == CardType.Pass }}")
//    println("shf = ${cards.count { it.type == CardType.Shuffle }}")
//    println("exk = ${cards.count { it.type == CardType.ExplodingKitten }}")
//    println("cats = ${cards.count { it.type == CardType.Cat }}")
//    println("total = ${cards.size}")

    val decks = Array<MutableList<CardSkin>?>(players) {
        (cards.drop(it*7).take(7)+defuses[it]).toMutableList()
    }

    var finalDeck = (cards.drop(players*7) + defuses.drop(players) + kittens.apply{shuffle()}.take(players-1)).shuffled().shuffled().toMutableList()

    require(decks.all { it?.size == 8 })

    val fold = mutableListOf<CardSkin>()

    var currentPlayer = 0
    var attackStack = 0
    var attacksCount = 0

    Thread.sleep(1000)

    while (finalDeck.any { it.type == CardType.ExplodingKitten }) {
        if (currentPlayer == players) currentPlayer = 0
        val deck = decks[currentPlayer]
        if (deck == null) {
            currentPlayer++
            continue
        }
        var nextPlayer = (currentPlayer + 1) % players
        while (decks[nextPlayer] == null)
            nextPlayer = (nextPlayer + 1) % players

        val nextDeck = decks[nextPlayer]!!

        println("Ходит игрок #$currentPlayer")
        println("Твои карты: ${deck.joinToString("/") { it.name }}")
        println("Что играем?")
        println("${deck.joinToString(" / ") { it.name }} --- Взять")

        val selected = readlnOrNull() ?: ""
        if (selected == "Взять") {
            val nextCard = finalDeck.removeFirst()
            if (nextCard.type == CardType.ExplodingKitten) {
                println("Игрок $currentPlayer вытащил Взрывного Котенка!")
                if (deck.any { it.type == CardType.Defuse }) {
                    println("У него есть 10 секунд, чтобы его обезвредить!")
                    println("Обезвреживаем?")
                    val defuse = readlnOrNull()
                    if (defuse == "Да") {
                        println("Обезврежено!")
                        fold.add(deck.removeAt(deck.indexOfFirst { it.type == CardType.Defuse }))
                        println("Куда затасовываем котенка? (0-${finalDeck.size - 1})")
                        val pos = readlnOrNull()?.toInt() ?: 0
                        finalDeck.add(pos, nextCard)
                    } else {
                        println("БУМ! Игрок $currentPlayer взорвался и выбывает из игры!")
                        decks[currentPlayer] = null
                    }
                } else {
                    println("БУМ! Игрок $currentPlayer взорвался и выбывает из игры!")
                    decks[currentPlayer] = null
                }
            } else {
                deck.add(nextCard)
            }
            if (attacksCount == 0) {
                currentPlayer = nextPlayer
            } else {
                attacksCount--
            }
            continue
        }

        val card = deck.find { it.name == selected }
        if (card == null){
            println("Нет такой карты")
            continue
        }

        println("Игрок $currentPlayer хочет сыграть ${card.name}")
        println(card.message)

        when (card.type) {
            CardType.Defuse -> {
                println("Нельзя играть обезвредь-карты!")
                continue
            }
            CardType.Cat -> {
                if (deck.count { it.name == card.name } < 2) {
                    println("Кошкокарты можно играть только парами!")
                    continue
                }

                if (nextDeck.isEmpty()) {
                    println("У игрока $nextPlayer нет карт!")
                    continue
                }

                println("Выбирай, какую карту хочешь украть у игрока $nextPlayer (0-${nextDeck.lastIndex}:")
                val nextCard = nextDeck.removeAt(readlnOrNull()?.toInt() ?: 0)
                deck.add(nextCard)
                println("Теперь у тебя есть карта ${nextCard.name}!")
            }
            CardType.Favor -> {
                if (nextDeck.isEmpty()) {
                    println("У игрока $nextPlayer нет карт!")
                    continue
                }
                println("Пусть игрок $nextPlayer выберет карту (0-${nextDeck.lastIndex}:")
                val nextCard = nextDeck.removeAt(readlnOrNull()?.toInt() ?: 0)
                deck.add(nextCard)
                println("Теперь у тебя есть карта ${nextCard.name}!")
            }
            CardType.Shuffle -> {
                if (finalDeck.size == 1) {
                    println("Смысл мешать колоду из одной карты*")
                    continue
                }
                finalDeck = finalDeck.shuffled().toMutableList()
                println("Колода перемешана!")
            }
            CardType.SeeTheFuture -> {
                val cardsAmount =  if (finalDeck.size < 3) finalDeck.size else 3
                println("Вот карты: ${finalDeck.take(cardsAmount).joinToString("/") { it.name }}")
            }
            CardType.Nope -> {
                TODO()
            }
            CardType.Pass -> {
                println("Игрок $currentPlayer слинял!")
                if (attacksCount == 0) {
                    currentPlayer = nextPlayer
                } else {
                    attacksCount--
                }
            }
            CardType.Attack -> {
                println("Игрок $currentPlayer атакует!")
                attackStack = attacksCount % 2
                attacksCount += 2
                currentPlayer = nextPlayer
            }
            CardType.ExplodingKitten -> {
                error("Взрывной котенок не может находиться в руке игрока!")
            }
        }

        deck.remove(card)
    }

    println("Игрок $currentPlayer выиграл!")
}