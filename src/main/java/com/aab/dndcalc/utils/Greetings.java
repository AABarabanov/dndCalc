package com.aab.dndcalc.utils;

public class Greetings {

    public static void printGreetings() {

        String art = """ 
                
                $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$XXXXXxXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                $$$$$$$$$$$$$$$$$$$$$$$$$$XXXXxxxxxxxxXXXXX$$$$$$$$$$$$$$$$$$XXXXXXXXxxxXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                $$$$$$$$$$$$$$$$$$$$$$$$XXx+;;::::::::::;;+++XX$$$$$$$$$$$&&$X$XxXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                $$$$$$$$$$$$$$$$$$$$$$Xx+;:::::.:::::;:::::::::;+xX$$$$$$$$&$XXXx+XXX;;+XXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                $$$$$$$$$$$$$$$$$$$$$X+;;;++;::.....:::.:::;;;+;;:;xX$$$$$$&$XXXxxXXxXXxXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                $$$$$$$$$$$$$$$$$$$Xx+;;::::...........::::;;;;;;:::xX$$$$&&$XXXXXXXxxxXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                $$$$$$$$$$$$$$$$$Xx;;;;::::.....:..:::::::.........::XX$$&&&XXxXX$XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                XXXXXXXXXXXXXXXXX+::;:::;::::;;:::.:::::....... .....:XX$&&&XXX$$XXX$$$XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                XXXXXXXXXXXXXXXx;:;;:::;:::;;;;;;:;;;;;;+;;;::........+X$&&&XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                XXXXXXXXXXXXXx;;;;;:.:::::+++++;;;;+++++++xxxx+++++;:.+X$$&&XX$XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                xxxxXXXXXXXX+::;::...::::++++++;++++++xxxxxxxxxXXXXXXx;x$$&&XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                xxxxxxxxXXX;:::::::.::::;+++++;+++++xxxxxxxxxXXXXXXXXXx;X$$&XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                XXXXXXXXXXx:::.:::;:;;;;;++++++++++xxxxxxxxxXXXXXXXXXXXX+X$&XXXX$XX$XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                XXXXXXXXXX+:::::;;;:;;;+++++++++++++xxxxxxXXXXXXXXXXXXXXX$$$XX$$$X$$XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                XXXXXXXXXX;::::;;;;;;;+xxxx+++++++++xxxxxXXXXXXXXXXXXXXXXX$$XX$X$$$$$XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                xxxxxxxxXX+;;:::;;:;+xxxxx;;;;;;;;;;++xxxxxXXXXXXXXXXXXXXX$&X$$$$$$$$XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                $$$$$XXXXXXx;:.:;:;+xx+++xx::;;;;;;;;;;;;+xxxXXXXXXXXXXXXX$$X$$$$$$$$XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                $$$$$$$$$$Xx;;;;;;;+xxxxxx+++++++++++;;::::;+xxxXXXXXXXXXXX$$$$$$$$$$XXX$XXXXXXXXXXXXXXXXXXXXXXXXXXXX
                XXxxxxxxxx++:..:::;+xxxxx+++++;;;;++++;;;;;;;;++xx+;;;;+xxX$$$$$$$$$$X$X$XXXXXXXXXXXXXXXXXXXXXXXXXXXX
                &&&&&&&&$++++++;:;+xxxxx++++++;;;:::;;;;;;;;;;::::;;:::;;;;xXX$$$$$$$$$XX$XXXXXXXXXXXXXXXXXXXXXXXXXXX
                &&&&&&&&x++++++;:;xxxxxx+++++++;;;;;+;;;;;;:;;xx;;;;;;;;;+xXXXx+x$$$$$$XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                xxxXXX$$+++++++;:+xxxxxxx+++++++++;;;;;;;;:::+xXx;:::;;+;+XXX+++;x$$$$$XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                ++;;;;+;++;;;;x+:+xxxxxxxxx+;+++++xx+++++;;;+++xXx;;;++;+x$XXXXxX$$$$$$XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                +;::::::;+;;;;++:;+xxxxxxxxxxx++xxxxxxx++:;+++xxxX+;++++xX$XXXXx$$$$XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                :::::::::xxx+++++++xxxxxxxxxx+++++++++++++++++xxxXXxxxxxxX$$$XxX$X$$XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                ::::::::::x+++;++++xxxxxxx++++++xxxxxx+++xxxxx++xxXXxxxxxX$&X+$$$X$$XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                :::::::::::;++;;++xxxxxx++++++++xxxxx++;;+;;::;+++xx++;+++xxxX$X$X$$$XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                :::::::::::::+++++xxxxx+++++++++++++xx+;;;;;;::;++;+xxxxxx$$$$$XXXX$XXXXXXXXxXXXXXXXXXXXXXXXXXXXXXXXX
                :::::::::::::+x++xxxx++++++++++++++++++;;;;;;;;+++xxxxxxxx$$$$$$XXXXXXXxXXXxxXXXXXXXXXXXXXXXXXXXXXXXX
                :::::::::::::+x+++++++++++++++;;;;;;;;;;;;;;;;;+;+Xxxxxx+X$$$$X$XXXXxXXXxxxxxXXXXXXXXXXXXXXXXXXXXXXXX
                :::::::::::::+x+++++++++++++++;;;;;;;;;;;;;;;;;;;+xxx++xX$$$$$$$XXXXXXXX$$&$;xXXXXXXXXXXXXXXXXXXXXXXX
                :::::::::::::+x++++++++++++++++++++;;;;;;;;;+++++++x++xX$$&&&&&&&&&&&&&&&&&$;xXXXXXXXXXXXXXXXXxxxxxXx
                :::::::::::::+x++;;;;;;++++++++++++++++++++++;;;;++++xX&&&&&&&&&&&&&&&&&&&&$;xXxXXXxXXXXXXXxxxxxxxxxx
                ::::::::::::;+x+++;;;;;;;;++;;;;+++++++++;;;+++xxxx++xX&&&&&&&&&&&&&&&&&&&&X;xXXxXXxxXXXxXxxxxxxxxxxx
                ::::::;;;;;:;+x++++;::;:;;;;;;;;;+++++++;;;;;;++xxxxxx$&&&&&&&&&&&$$$&&&$$$X:xxxxxxxxxxxxxxxxxxxxxxxx
                ::::::;;;;;;;+x++++;;::::::::::;;;;;;+++++++++xxxx+++x&&&&&&&&&&&XXXX&&&$XXX:xxxxxxxxxxxxxxxxxxxxxxxx
                :::::;;;;;;:;+++++++;;::::::::::;:;;;;;;;;;;++++++;;xX&&&&&&&&&&$XxxX$$&$XXx:+xxxxxxxxxxxxxxxxxxxxxxx
                ::::;;;;;;;:;++++++;;;;;:::::::::;;;;;;;;::;;;++;::xX$&&&&&&&&&&$xxxxxXXXxxx:++x++++++xxxxxxxxxxxxxxx
                ::::;;:;;;;:++++;;;;;;;;::::::::::;:::::::::;;;;;+XxX$xxXXX$$&&&Xxxxxxxx++++:+++++++++++xxxxxxxxxxxxx
                :::;;;;;;;::++++++;;;;;;;;::...........::.:.:::;xXXxx$+xxxxxxxxxxxx+x++xx+++:+xx+++++++++++xxxxxxxxxx
                ;;;;;;;;;::.+++++++;;;;;;;;;;::.....::::.....:+XXXXxxXxxxxxxxxxxxxxxxXx+++++:+x+x+++++++++++++xxxxxxx
                xxxxxxx+:::.:+++++;;;;;;;;;;;;;;;;;;;;;;;;;+++;++++xxXxxxxxxxxxxxxxxxXx+++++:+x+x++++++++++++++xxxxxx
                Xxxxxx+:::::.:;;;+;;;;;;;;;;;+++++++++++++++x+::+;++xXxxxxxxxxxxxxxxxXx+++++:++++++++++++++++++++xxxx
                +Xxxx+::::::::;;;;;;;;;;;;;;;;++++++++++++++x;:.;;:.::::;;+++x;;::;;++xx++++:+++++++++++++++++++xx+xx
                :::::;:::::::::;;;;+++++;;;;;;;+++++++++xx++x:.:;+;::..:;;::::::::::;;;;;+x+:++++++++++++++++++++xxxx
                ::::.;::::::::::;;;++++++++;;;;;++++++xxx++x+.:;:;+;;::..:;;;;::::;;:;;;;;:::;+x+++++++++++++++++xxxx
                :::::;::::::::::;;;;++++++++++++++xxx++x++++.:::;;+;;;::.::::::;;;;:::;;;;;;::;;++++++++++++++++++xxx
                :::.:::::::::::::;;;;+++++++++++xxxx+++++++:.::;;;++;::::::::::;;;;::::;;;;;:::;;;;;+++++++++++++++xx
                ::..:;:::::::::::::;;;+++++++++++++++++;:....::;;;+;;;::::;::::::::::::;;;;::::;;;;::+++++++++++++x+x
                .::::;:::::::::::.....:;+++;;+++;;::........:::;;;+;;+::::::::::;::::::;;;;:::;;::::;+++++++++++++xxx
                :::::;:::::::::::::........................:::::;;;+;;;::::::::;;:::::;;;;;:::;;:.:;++++++++++++++xxx
                :::::;::::::::::::::......................::::::;;;+;;;;:::::::;::::::;;;;;;::;;:;;:;+++++++++++++xxx
                :::::;::::::::::::::::...................++:;;;;;+;++;;;+;::::;:::::::;;;;;:::;;;;;;;;;+++++++++++x+x
                :::::;:::::::::::::::::.................+XX+++;++:..;+;;;;;:::;;::::::;;;;::::;:;+;;;;;;+++++++++++x+
                :::::::::::::::::;;..:;:...  ..........:x;............:+;;;+::;:::::::;;;;:::;;:;;;;;;;;;++++++++++xx
                ::::.:::::::::::.......;;:.....   .....+;.................::::::::::::;;;;:::;;:;;;;;;;;;;;++++++++++
                ::::.:;::::;:...........:;;;::;;;.....;+;..............::::::::::::::::;:::::;;:;;;;;;;;;;;;;++++x+++
                .....:;:::.................:;+;...:..:++:...........:::::::::::.::::::;;:::::;;:;;;:;;;;;;;;;;;++++++
                :.....:............................:.++;:........::::::::::::::.::::::::::::;;;:;::;;;;;;;;;;;;;+++++
                ::::..........................:::...;++:......::::::::::::::::..:::::::::::::;;:::::;;;;;;;;;;;;+++++
                ::::::::..................::::::::.:++:.....:::....:::::::::::..:::::::::::::;:::::::::;;;;;;;;;;;+++
                :::::::::::................:;;::...++:......:::.......:::::::...:::::::::::::;::::::::;;;;;;;;;;;;++x
                ::::::::....................::;::::;+:......:::........::::::..::::::::::::::::....::.:;;;;;;;;;;;;+x
                :::::::::.....................:;;::++:.::...::.........:::::...::::::::::::::;:..:...:::::;;;;;;;;;+x
                ::::::::.............::........::.;+;..:::..::..........::::..::::::::::::::::.....::::;;::::;;;;;;++
                :.:::::............:...:........;:;+;..:;::::.................::::::::::::::::....::......:::::;;;;;:
                ::..::::................:.......:.:+:...:::..:...............:::::::::::::::::...:::::::;;;;;;:::::::
                .....:::.....::::.......::.....::.:+:......::::.:.........::::::::::::::::::::...::::::;;;;:::.....::
                .....:::::::::::::::....:::....::..+;......::::.........::::::::::::::::::.........::::...........::;
                .......:::::::::::::....:::::..::..;;:....:::::......::::::::::::::::::::::........:::.......::::;;;;
                ........::::::::::::.....::::::::..;;;:......:..:::::::::::::::::::::::::.....:....:::.....:::::;;:;;AAB
                """;

        System.out.println(art);
    }

}
