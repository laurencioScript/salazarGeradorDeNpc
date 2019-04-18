package com.example.salazar_geradordenpc;


    class bancoDados
    {
        // VETORES DA RAÇA MASCULINA

        private String nomeNpcAnaoH[] = {   "Adrik", "Alberich", "Baern", "Barendd", "Brottor",
                "Bruenor", "Dain", "Darrak", "Delg", "Eberk",
                "Einkil", "Fargrim", "Flint", "Gardain", "Harbek",
                "Kildrak", "Morgran", "Orsik", "Oskar", "Rangrim",
                "Rurik", "Taklinn", "Thoradin", "Thorin", "Tordek",
                "Traubon", "Travok", "Ulfgar", "Veit", "Vondal"
        };

        private String nomeNpcElfoH[] = {   "Adran", "Aelar", "Aramil", "Arannis", "Aust",
                "Beiro", "Berrian", "Carric", "Enialis", "Erdan",
                "Erevan", "Galinndan", "Hadarai", "Heian", "Himo",
                "Immeral", "Ivellios", "Laucian", "Mindartis", "Paelias",
                "Peren", "Quarion", "Riardon", "Rolen", "Soveliss",
                "Thamior", "Tharivol", "Theren", "Varis"};

        private String nomeNpcHalflingH[] = {"Alton", "Ander", "Cade", "Corrin", "Eldon",
                "Finnan", "Garret", "Lindal", "Lyle", "Merric",
                "Milo", "Osborn", "Perrin", "Reed", "Roscoe",
                "Wellby", "Arthan", "Carvin", "Corby", "Cullen",
                "Egen", "Ernest", "Gedi", "Heron", "Jeryl",
                "Keffen", "Kylem", "Kynt", "Leskyn", "Neff",
                "Orne", "Quarrel", "Rabbit", "Rilkin", "Snakebait",
                "Tarfen", "Titch", "Tuck", "Whim","Errich",};


        private String nomeNpcHumanoH[] = {"Aseir", "Bardeid", "Haseid", "Khemed", "Mehmen", "Sudeiman", "Zasheir", "Darvin", "Dorn", "Evendur", "Gorstag", "Grim", "Helm", "Malark", "Morn", "Ranal", "Stedd", "Bor", "Fodel", "Glar", "Grigor", "Igan", "Ivor", "Kosef", "Mival", "Orel", "Pavel", "Sergor", "Ander", "Blath", "Bran", "Frath", "Geth",
                "Lader", "Luth", "Malcer", "Stor", "Taman", "Urth", "Aoth", "Bareris", "EhputKi", "Kethoth", "Mumed", "Ramas", "SoKehur", "ThazarDe", "Urhur", "Borivik", "Faurgar", "Jandar", "Kanitar", "Madislak", "Ralmevik", "Shaumar", "Vladislak", "An", "Chen", "Chi", "Fai", "Jiang", "Jun", "Lian", "Long", "Meng", "On", "Shan", "Shui", "Wen",
                "Anton", "Diero", "Marcon", "Pieron", "Rimardo", "Romero", "Salazar", "Umbero"};


        private String nomeNpcDraconatoH[] = {  "Arjhan", "Balasar", "Bharash", "Donaar", "Ghesh",
                "Heskan", "Kriv", "Medrash", "Mehen", "Nadarr",
                "Pandjed", "Patrin", "Rhogar", "Shamash", "Shedinn",
                "Tarhun", "Torinn", "Andujar", "Armagan", "Armek",
                "Arzan", "Axaran", "Belaxarim", "Brevarr", "Djemidor",
                "Draxan", "Fayal", "Grax", "Iojad", "Inzul", "Khiraj",
                "Kreytzen", "Lejek", "Mar", "Nazir", "Nedam", "Nevek",
                "Ravaran", "Razaan", "Sarax", "Sarram", "Savaxis",
                "Siangar", "Sirizan", "Sunan", "Szuran", "Tajan", "Tamajon",
                "Tenahn", "Toxal", "Tzegyr", "Vantajar", "Vharkus", "Xafiq", "Zarkhil"};



        private String nomeNpcGnomoH[] = {  "Alston", "Alvyn", "Boddynock", "Brocc", "Burgell",
                "Dimble", "Eldon", "Erky", "Fonkin", "Frug",
                "Gerbo", "Gimble", "Glim", "Jebeddo", "Kellen",
                "Namfoodle", "Orryn", "Roondar", "Seebo", "Sindri",
                "Warryn", "Wrenn", "Zook"};

        private String nomeNpcMeioElfoH[] = {   "Aseir", "Bardeid", "Haseid", "Khemed", "Mehmen",
                "Sudeiman", "Zasheir", "Darvin", "Dorn", "Evendur",
                "Gorstag", "Grim", "Helm", "Malark", "Morn",
                "Ranal", "Stedd", "Bor", "Fodel", "Glar",
                "Grigor", "Igan", "Ivor", "Kosef", "Mival",
                "Orel", "Pavel", "Sergor", "Ander", "Blath",
                "Bran", "Frath", "Geth", "Lader", "Luth",
                "Malcer", "Stor", "Taman", "Urth", "Aoth",
                "Bareris", "EhputKi", "Kethoth", "Mumed", "Ramas",
                "SoKehur", "ThazarDe", "Urhur", "Borivik", "Faurgar",
                "Jandar", "Kanitar", "Madislak", "Ralmevik", "Shaumar",
                "Vladislak", "An", "Chen", "Chi", "Fai",
                "Jiang", "Jun", "Lian", "Long", "Meng",
                "On", "Shan", "Shui", "Wen", "Anton",
                "Diero", "Marcon", "Pieron", "Rimardo", "Romero",
                "Salazar", "Umbero", "Adran", "Aelar", "Aramil",
                "Arannis", "Aust", "Beiro", "Berrian", "Carric",
                "Enialis", "Erdan", "Erevan", "Galinndan", "Hadarai",
                "Heian", "Himo", "Immeral", "Ivellios", "Laucian",
                "Mindartis", "Paelias", "Peren", "Quarion", "Riardon",
                "Rolen", "Soveliss", "Thamior", "Tharivol", "Theren",
                "Varis"};
        //12 nomes meio orc
        private String nomeNpcMeioOrcH[] = {"Dench", "Feng", "Gell", "Henk", "Holg", "Imsh", "Keth", "Krusk", "Mhurren", "Ront", "Shump", "Thokk"};
        //59 nomes tiefling
        private String nomeNpcTieflingH[] = {"Akmenos", "Amnon", "Barakas", "Damakos", "Ekemon",
                "Iados", "Kairon", "Leucis", "Melech", "Mordai",
                "Morthos", "Pelaios", "Skamos", "Therai", "Ankhus",
                "Arkadi", "Armarius", "Armillius", "Archidius", "Balmoloch",
                "Calderax", "Cavian", "Cenereth", "Chorum", "Corynax",
                "Dacian", "Daelius", "Damaceus", "Decimeth", "Demedor",
                "Demerian", "Dynachus", "Grassus", "Halius", "Heleph",
                "Incirion", "Kalaradian", "Kamien", "Kazimir", "Kzandro",
                "Machem", "Maetheus", "Malfias", "Marchion", "Menerus",
                "Namazeus", "Nensis", "Prismeus", "Pyranikus", "Razortail",
                "Sejanus", "Severian", "Suffer", "Syken", "Tarkus",
                "Vaius", "Xerek", "Zeth", "Zevon"};

        // =============================================================================================================================================

        // NUMEROS DOS VETORES DA RAÇA MASCULINA

        private Integer numeroNpcAnaoH = nomeNpcAnaoH.length;
        private Integer numeroNpcElfoH = nomeNpcElfoH.length;
        private Integer numeroNpcHalflingH = nomeNpcHalflingH.length;
        private Integer numeroNpcHumanoH = nomeNpcHumanoH.length;
        private Integer numeroNpcDraconatoH = nomeNpcDraconatoH.length;
        private Integer numeroNpcGnomoH = nomeNpcGnomoH.length;
        private Integer numeroNpcMeioElfoH = nomeNpcMeioElfoH.length;
        private Integer numeroNpcMeioOrcH = nomeNpcMeioOrcH.length;
        private Integer numeroNpcTieflingH = nomeNpcTieflingH.length;

        // =============================================================================================================================================

        // VETORES DA RAÇA FEMININA

        private String nomeNpcAnaoF[] = {"Amber", "Artin", "Audhild", "Bardryn", "Dagnal", "Diesa", "Eldeth", "Falkrunn", "Gunnloda", "Gurdis", "Helja", "Hlin", "Kathra", "Kristryd", "Ilde", "Liftrasa", "Mardred", "Riswynn", "Sannl", "Torbera", "Torgga", "Vistra"};
        //30
        private String nomeNpcElfoF[] = {"Adrie", "Althaea", "Anastrianna", "Andraste", "Antinua", "Bethrynna", "Birel", "Caelynn", "Drusilia", "Enna", "Felosial", "Ielenia", "Jelenneth", "Keyleth", "Leshanna", "Lia", "Meriele", "Mialee", "Naivara", "Quelenna", "Quillathe", "Sariel", "Shanairra", "Shava", "Silaqui", "Theirastra", "Thia", "Vadania", "Valanthe", "Xanaphia"};
        //18
        private String nomeNpcHalflingF[] = {"Andry", "Bree", "Callie", "Cora", "Euphemia", "Jillian", "Kithri", "Lavinia", "Lidda", "Merla", "Nedda", "Paela", "Portia", "Seraphina", "Shaena", "Trym", "Vani", "Verna"};
        //67
        private String nomeNpcHumanoF[] = {"Atala", "Ceidil", "Hama", "Jasmal", "Meilil", "Seipora", "Yasheira", "Zasheida", "Arveene", "Esvele", "Jhessail", "Kerri", "Lureene", "Miri", "Rowan", "Shandri", "Tessele", "Alethra", "Kara", "Katernin", "Mara", "Natali", "Olma", "Tana", "Zora", "Amafrey", "Betha", "Cefrey", "Kethra", "Mara", "Olga", "Silifrey", "Westra", "Bai", "Chao",
                "Jia", "Lei", "Mei", "Quio", "Shui", "Tai", "Balama", "Dona", "Faila", "Jalana", "Luisa", "Marta", "Quara", "Selise", "Vonda", "Arizima", "Chathi", "Nephis", "Nulara", "Murithi", "Sefris", "Thola", "Umara", "Zolis", "Fyevarra", "Hulmarr", "Immith", "Imzel", "Navarra", "Shevarra", "Tammith", "Yuldra"};
        //17
        private String nomeNpcDraconatoF[] = {"Akra", "Biri", "Daar", "Farideh", "Harann", "Flavilar", "Jheri", "Kava", "Korinn", "Mishann", "Nala", "Perra", "Raiann", "Sora", "Surina", "Thava", "Uadjit"};
        //22
        private String nomeNpcGnomoF[] = {"Bimpnottin", "Breena", "Carami", "Carlin", "Donella", "Duvamil", "Ella", "Ellyjobell", "Ellywick", "Lilli", "Loopmottin", "Lorilla", "Mardnab", "Nissa", "Nyx", "Oda", "Orla", "Roywyn", "Shamil", "Tana", "Waywocket", "Zanna"};
        //97
        private String nomeNpcMeioElfoF[] = {"Adrie", "Althaea", "Anastrianna", "Andraste", "Antinua", "Bethrynna", "Birel", "Caelynn", "Drusilia", "Enna", "Felosial", "Ielenia", "Jelenneth", "Keyleth", "Leshanna", "Lia", "Meriele", "Mialee", "Naivara", "Quelenna", "Quillathe", "Sariel", "Shanairra", "Shava", "Silaqui", "Theirastra", "Thia", "Vadania", "Valanthe", "Xanaphia",
                "Atala", "Ceidil", "Hama", "Jasmal", "Meilil", "Seipora", "Yasheira", "Zasheida", "Arveene", "Esvele", "Jhessail", "Kerri", "Lureene", "Miri", "Rowan", "Shandri", "Tessele", "Alethra", "Kara", "Katernin", "Mara", "Natali", "Olma", "Tana", "Zora", "Amafrey", "Betha", "Cefrey", "Kethra", "Mara", "Olga", "Silifrey", "Westra", "Bai", "Chao",
                "Jia", "Lei", "Mei", "Quio", "Shui", "Tai", "Balama", "Dona", "Faila", "Jalana", "Luisa", "Marta", "Quara", "Selise", "Vonda", "Arizima", "Chathi", "Nephis", "Nulara", "Murithi", "Sefris", "Thola", "Umara", "Zolis", "Fyevarra", "Hulmarr", "Immith", "Imzel", "Navarra", "Shevarra", "Tammith", "Yuldra"};
        //13
        private String nomeNpcMeioOrcF[] = {"Baggi", "Emen", "Engong", "Kansif", "Myev", "Neega", "Ovak", "Ownka", "Shautha", "Sutha", "Vola", "Volen", "Yevelda"};
        //13
        private String nomeNpcTieflingF[] = {"Akta", "Anakis", "Bryseis", "Criella", "Damaia", "Ea", "Kallista", "Lerissa", "Makaria", "Nemeia", "Orianna", "Phelaia", "Rieta"};

        // =============================================================================================================================================

        // NUMEROS DOS VETORES FEMININOS

        private Integer numeroNpcAnaoF = nomeNpcAnaoF.length;
        private Integer numeroNpcElfoF = nomeNpcElfoF.length;
        private Integer numeroNpcHalflingF = nomeNpcHalflingF.length;
        private Integer numeroNpcHumanoF = nomeNpcHumanoF.length;
        private Integer numeroNpcDraconatoF = nomeNpcDraconatoF.length;
        private Integer numeroNpcGnomoF = nomeNpcGnomoF.length;
        private Integer numeroNpcMeioElfoF = nomeNpcMeioElfoF.length;
        private Integer numeroNpcMeioOrcF = nomeNpcMeioOrcF.length;
        private Integer numeroNpcTieflingF = nomeNpcTieflingF.length;

        // =============================================================================================================================================

        // VETORES DE SOBRENOME

        private String sobrenomeNpcAnao[] = {"Balderk", "Battlehammer", "Brawnanvil", "Dankil", "Fireforge", "Frostbeard", "Gorunn", "Holderhek", "Ironfist", "Loderr", "Lutgehr", "Rumnaheim", "Strakeln", "Torunn", "Ungart"};

        private String sobrenomeNpcElfo[] = {"Autumnloft", "Balefrost", "Briarfell", "Evenwind", "Graytrails", "Mooncairn", "Riverwall", "Stormwolf", "Summergale", "Sunshadow", "Woodenhawk"};

        private String sobrenomeNpcHalfling[] = {"Cata-Escovas", "Bom-Barril", "Garrafa Verde", "Alta Colina", "Baixa Colina", "Prato Cheio", "Folha de Chá", "Espinhudo", "Cinto Frouxo", "Galho Caído"};

        private String sobrenomeNpcHumano[] = {"Basha", "Dumein", "Jassan", "Khalid", "Mostana", "Pashar", "Rein", "Amblecrown", "Buckman", "Dundragon", "Evenwood", "Greycastle", "Tallstag", "Chien", "Huang", "Kao", "Kung", "Lao", "Ling", "Mei", "Pin", "Shin", "Sum", "Tan", "Wan"};

        private String sobrenomeNpcDraconato[] = {"Clethtinthiallor", "Daardendrian", "Delmirev", "Drachedandion", "Fenkenkabradon", "Kepeshkmolik", "Kerrhylon", "Kimbatuul", "Linxakasendalor", "Myastan", "Nemmonis", "Norixius", "Ophinshtalajiir", "Prexijandilin", "Shestendeliath", "Turnuroth", "Verthisathurgiesh", "Yarjerit"};

        private String sobrenomeNpcGnomo[] = {"Beberrão", "Pó de Coração", "Texugo", "Manto", "Tranca-Dupla", "Bate-Carteira", "Fnipper", "Ku", "Nim", "Um Sapato", "Pústula", "Gema Faiscante", "Pato Desajeitado"};

        private String sobrenomeNpcMeioElfo[] = {"Autumnloft", "Balefrost", "Briarfell", "Evenwind", "Graytrails", "Mooncairn", "Riverwall", "Stormwolf", "Summergale", "Sunshadow", "Woodenhawk", "Basha", "Dumein", "Jassan", "Khalid", "Mostana", "Pashar", "Rein", "Amblecrown", "Buckman", "Dundragon", "Evenwood", "Greycastle", "Tallstag", "Chien", "Huang", "Kao", "Kung", "Lao", "Ling", "Mei", "Pin", "Shin", "Sum", "Tan", "Wan"};

        private String sobrenomeNpcTiefling[] = {"Abertura", "Arte", "Carniça", "Canção", "Crença", "Desespero", "Excelência", "Esperança", "Gloria", "Ideal", "Ímpeto", "Música", "Nada", "Poesia", "Medo", "Missão", "Penoso", "Reverencia", "Mágoa", "Temeridade", "Tormenta"};

        // =============================================================================================================================================

        // NUMEROS DE VETORES DE SOBRONOME

        private Integer numeroSobreNomeAnao = sobrenomeNpcAnao.length;
        private Integer numeroSobreNomeElfo = sobrenomeNpcElfo.length;
        private Integer numeroSobreNomeHalfling = sobrenomeNpcHalfling.length;
        private Integer numeroSobreNomeHumano = sobrenomeNpcHumano.length;
        private Integer numeroSobreNomeDracanato = sobrenomeNpcDraconato.length;
        private Integer numeroSobreNomeGnomo = sobrenomeNpcGnomo.length;
        private Integer numeroSobreNomeMeioElfo = sobrenomeNpcMeioElfo.length;
        private Integer numeroSobreNomeTiefling = sobrenomeNpcTiefling.length;



        // =============================================================================================================================================

        private int numNomeAnaoM = (int) Math.floor(Math.random() * numeroNpcAnaoH);
        private  int numNomeElfoM = (int) Math.floor(Math.random() * numeroNpcElfoH);
        private  int numNomeHalfM = (int) Math.floor(Math.random() * numeroNpcHalflingH);
        private  int numNomeHumM = (int) Math.floor(Math.random() * numeroNpcHumanoH);
        private  int numNomeDraM = (int) Math.floor(Math.random() * numeroNpcDraconatoH);
        private  int numNomeGnoM = (int) Math.floor(Math.random() * numeroNpcGnomoH);
        private  int numNomeMelfoM = (int) Math.floor(Math.random() * numeroNpcMeioElfoH);
        private  int numNomeMorcM = (int) Math.floor(Math.random() * numeroNpcMeioOrcH);
        private  int numNomeTiefM = (int) Math.floor(Math.random() * numeroNpcTieflingH);

        private  int numNomeAnaoF = (int) Math.floor(Math.random() * numeroNpcAnaoF);
        private  int numNomeElfoF = (int) Math.floor(Math.random() * numeroNpcElfoF);
        private  int numNomeHalfF = (int) Math.floor(Math.random() * numeroNpcHalflingF);
        private  int numNomeHumF = (int) Math.floor(Math.random() * numeroNpcHumanoF);
        private  int numNomeDraF = (int) Math.floor(Math.random() * numeroNpcDraconatoF);
        private  int numNomeGnoF = (int) Math.floor(Math.random() * numeroNpcGnomoF);
        private  int numNomeMelfoF = (int) Math.floor(Math.random() * numeroNpcMeioElfoF);
        private  int numNomeMorcF = (int) Math.floor(Math.random() * numeroNpcMeioOrcF);
        private  int numNomeTiefF = (int) Math.floor(Math.random() * numeroNpcTieflingF);

        private  int numSobreNomeAnao = (int) Math.floor(Math.random() * numeroSobreNomeAnao);
        private  int numSobreNomeElfo = (int) Math.floor(Math.random() * numeroSobreNomeElfo);
        private  int numSobreNomeHalf = (int) Math.floor(Math.random() * numeroSobreNomeHalfling);
        private  int numSobreNomeHum = (int) Math.floor(Math.random() * numeroSobreNomeHumano);
        private  int numSobreNomeDra = (int) Math.floor(Math.random() * numeroSobreNomeDracanato);
        private  int numSobreNomeGno = (int) Math.floor(Math.random() * numeroSobreNomeGnomo);
        private  int numSobreNomeMelfo = (int) Math.floor(Math.random() * numeroSobreNomeMeioElfo);
        private  int numSobreNomeTief = (int) Math.floor(Math.random() * numeroSobreNomeTiefling);

        //----------------------------------------------

        // METODOS DOS NUMEROS ALEATORIOS DOS NOMES MASCULINOS, FEMININOS E SOBRENOMES

        int getNumNomeAnaoM() {
            return numNomeAnaoM;
        }

        int getNumNomeElfoM() {
            return numNomeElfoM;
        }

        int getNumNomeHalfM() {
            return numNomeHalfM;
        }

        int getNumNomeHumM() {
            return numNomeHumM;
        }

        int getNumNomeDraM() {
            return numNomeDraM;
        }

        int getNumNomeGnoM() {
            return numNomeGnoM;
        }

        int getNumNomeMelfoM() {
            return numNomeMelfoM;
        }

        int getNumNomeMorcM() {
            return numNomeMorcM;
        }

        int getNumNomeTiefM() {
            return numNomeTiefM;
        }

        //

        int getNumNomeAnaoF() {
            return numNomeAnaoF;
        }

        int getNumNomeElfoF() {
            return numNomeElfoF;
        }

        int getNumNomeHalfF() {
            return numNomeHalfF;
        }

        int getNumNomeHumF() {
            return numNomeHumF;
        }

        int getNumNomeDraF() {
            return numNomeDraF;
        }

        int getNumNomeGnoF() {
            return numNomeGnoF;
        }

        int getNumNomeMelfoF() {
            return numNomeMelfoF;
        }

        int getNumNomeMorcF() {
            return numNomeMorcF;
        }

        int getNumNomeTiefF() {
            return numNomeTiefF;
        }

        int getNumSobreNomeAnao() {
            return numSobreNomeAnao;
        }

        int getNumSobreNomeElfo() {
            return numSobreNomeElfo;
        }

        int getNumSobreNomeHalf() {
            return numSobreNomeHalf;
        }

        int getNumSobreNomeHum() {
            return numSobreNomeHum;
        }

        int getNumSobreNomeDra() {
            return numSobreNomeDra;
        }

        int getNumSobreNomeGno() {
            return numSobreNomeGno;
        }

        int getNumSobreNomeMelfo() {
            return numSobreNomeMelfo;
        }

        int getNumSobreNomeTief() {
            return numSobreNomeTief;
        }







        // =============================================================================================================================================

        // METODOS DOS NOMES MASCULINOS

        String pegaNomeAnaoH(int numNomeAnaoM) {
            return nomeNpcAnaoH[numNomeAnaoM];
        }

        String pegaNomeElfoH(int numNomeElfoM) {
            return nomeNpcElfoH[numNomeElfoM];
        }

        String pegaNomeHalfH(int numNomeHalfM) {
            return nomeNpcHalflingH[numNomeHalfM];
        }

        String pegaNomeHumaH(int numNomeHumM) {
            return nomeNpcHumanoH[numNomeHumM];
        }

        String pegaNomeDracH(int numNomeDraM) {
            return nomeNpcDraconatoH[numNomeDraM];
        }

        String pegaNomeGnomH(int numNomeGnoM) {
            return nomeNpcGnomoH[numNomeGnoM];
        }

        String pegaNomeMeioEH(int numNomeMelfoM) {
            return nomeNpcMeioElfoH[numNomeMelfoM];
        }

        String pegaNomeMeioOH(int numNomeMorcM) {
            return nomeNpcMeioOrcH[numNomeMorcM];
        }

        String pegaNomeTiefH(int numNomeTiefM) {
            return nomeNpcTieflingH[numNomeTiefM];
        }

        // =============================================================================================================================================

        // METODOS DOS NOMES FEMININOS

        String pegaNomeAnaoF(int numNomeAnaoF) {
            return nomeNpcAnaoF[numNomeAnaoF];
        }

        String pegaNomeElfoF(int numNomeElfoF) {
            return nomeNpcElfoF[numNomeElfoF];
        }

        String pegaNomeHalfF(int numNomeHalfF) {
            return nomeNpcHalflingF[numNomeHalfF];
        }

        String pegaNomeHumaF(int numNomeHumF) {
            return nomeNpcHumanoF[numNomeHumF];
        }

        String pegaNomeDracF(int numNomeDraF) {
            return nomeNpcDraconatoF[numNomeDraF];
        }

        String pegaNomeGnomF(int numNomeGnoF) {
            return nomeNpcGnomoF[numNomeGnoF];
        }

        String pegaNomeMeioEF(int numNomeMelfoF) {
            return nomeNpcMeioElfoF[numNomeMelfoF];
        }

        String pegaNomeMeioOF(int numNomeMorcF) {
            return nomeNpcMeioOrcF[numNomeMorcF];
        }

        String pegaNomeTiefF(int numNomeTiefF) {
            return nomeNpcTieflingF[numNomeTiefF];
        }

        // =============================================================================================================================================

        // METODOS DOS SOBRENOMES

        String pegaSobreNomeAnao(int numSobreNomeAnao) {
            return sobrenomeNpcAnao[numSobreNomeAnao];
        }

        String pegaSobreNomeElfo(int numSobreNomeElfo) {
            return sobrenomeNpcElfo[numSobreNomeElfo];
        }

        String pegaSobreNomeHalf(int numSobreNomeHalf) {
            return sobrenomeNpcHalfling[numSobreNomeHalf];
        }

        String pegaSobreNomeHuma(int numSobreNomeHum) {
            return sobrenomeNpcHumano[numSobreNomeHum];
        }

        String pegaSobreNomeDrac(int numSobreNomeDrac) {
            return sobrenomeNpcDraconato[numSobreNomeDrac];
        }

        String pegaSobreNomeGnom(int numSobreNomeGno) {
            return sobrenomeNpcGnomo[numSobreNomeGno];}

        String pegaSobreNomeMeioE(int numSobreNomeMelfo) {
            return sobrenomeNpcMeioElfo[numSobreNomeMelfo];
        }

        String pegaSobreNomeTief(int numSobreNomeTief) {
            return sobrenomeNpcTiefling[numSobreNomeTief];
        }


        // =============================================================================================================================================


        private String sexoNpc[] = {"Masculino", "Feminino"};

        private String racaNpc[] = {"Anão da Colina", "Anão da Montanha", "Alto Elfo", "Elfo da Floresta", "Elfo Negro",
                "Halfling Pés Leve", "Halfling Robusto", "Humano", "Draconatos", "Gnomo da Floresta",
                "Gnomo da Rocha", "Meio Elfo", "Meio Orc", "Tiefling"};

        private String aparenciaNpc[] = {"Joia chamativa", "Piercings", "Roupas extravagantes ou estrangeiras", "Roupas rasgadas e sujas", "Cicatriz notória",
                "Dente faltando", "Dedos faltando", "Cor de olho incomum", "Tatuagens", "Marca de nascença",
                "Cor de pele incomum", "Careca", "Barba ou cabelo trançado", "Cor de Cabelo incomum", "Movimento de olhos nervoso",
                "Nariz distinto", "Postura distinta", "Excepcionalmente belo", "Excepcionalmente feio", "Carrega uma arma chamativa",
                "Possui um simbolo estranho na roupa", "Falta um olho", "Trêmulo", "duas mãos  esquerdas/direitas", "Sempre sorrindo",
                "Cara seria", "Aparenta ser forte", "calvo", "Cabeludo", "Sem dentes",
                "Queimadura em alguma parte do corpo visivel", "Boca torta","Braço menor", "Manco", "Barriga tanquinho",
                "Bunda notável", " Peitos grandes", "Olhos serenos"};

        private String habilidadesNpc[]={"Força - Poderoso ou Musculoso", "Destreza - Esbelto ou ágil ou gracioso", "Constituição - Resistente ou Robusto ou Sadio",
                "Inteligencia - Estudioso ou Escolado ou Curioso", "Sabedoria - Perceptivo ou Espiritualizado ou Intuitivo",
                "Carisma - Persuasivo ou Convicente ou Lider natural", "Força - fraco,magrelo", "Destreza - desajeitado, desastrado",
                "Constituição - doentio, pálido", "Inteligencia - estúpido, lento", "Sabedoria - esquecido,distraido", "Carisma - enfadonho, chato"};


        private String donsNpc[] = {"Toca um instrumento musical", "Fala diversos idiomas fluentemente", "Inacreditavelmente sortudo", "Memoria perfeita",
                "Bom com animais", "Bom com crianças", "Bom em resolver enigmas", "Bom em jogo", "Bom em imitação", "Desenha lindamente",
                "Pinta lindamente", "Canta lindamente","Bebe tudo sobre a mesa", "Carpinteiro Especialista", "Cozinheiro especialista",
                "Especialsita em arremesar facas", "Malabarista especialista", "Ator e mestre dos disfarces perito", "Dançarino experiente",
                "Conhece girias de ladrão", "Tem pequenas visões", "Gosta de fazer contas matematicas", "Maioria das vezes toma a decisão certa",
                "Bom com conselhos", "Bom com todas as armas", "Olfato sensivel", "Tem boas previsões do tempo", "Atrai pessoas facilmente",
                "Lider Natural", "Consegue lê as pessoas"};

        private String defesegreNpc[] = {"Amor perdido ou suscetível a se apaixonar", "Gosta de prazeres escusos", "Arrogante", "Inveja as posses ou posto de outra criatura",
                "Ganância desenfreada", "Inclinado a se enfurecer", "Tem um inimigo poderoso", "Fobia específica", "História vergonhosa ou escandalosa",
                "Crime ou delito secreto", "Possui conhecimento proibido", "Bravura imprudente"};

        private String vinculosNpc[] = {"Dedicado a completar um objetivo de vida pessoal", "Protege membros próximos da família", "Protege colegas ou compatriotas",
                "Leal a um benfeitor", "patrono ou empregador", "Cativado por um interesse romântico", "Atraído por um local especial",
                "Protege uma lembrança especial", "Protege um bem valioso", "Em busca de vingança"};

        private String idealNpc[] = {"Leal e Bom", "Neutro e Bom", "Caótico e Bom", "Leal e Neutro", "Neutro", "Caótico e Neutro", "Leal e Mau", "Neutro e Mau", "Caótico e Mau"};

        private String tracoNpc[] = {"Argumentativo", "Arrogante", "Barulhento", "Rude", "Curioso", "Amigável", "Honesto", "Esquentado", "Irritadiço", "Ponderado",
                "Quieto", "Desconfiado", "Sadico", "Carinhoso", "Indeciso", "Interesseiro", "Criativo", "Confiavel", "Triste", "Calmo"};


        private String maneirismoNpc[] = {"Inclinado a cantar", "assobiar ou resmungar rapidamente", "Fala em rimas ou de alguma outra forma peculiar",
                "Voz particularmente baixa ou alta", "Palavra incompreesiveis", "Fala excessivamente", "Fala gritando", "Sussurros",
                "Fala de forma rebuscada ou com palavras longas", "Usa palavras erradas com frequencia", "Usa injurias e exclamações",
                "Faz piadas e trocadilhos constantemente", "Inclinado à previsões dramáticas", "Impaciente", "Vesgo", "Olhar distante",
                "Masca Alguma coisa", "Paciente", "Estrala os dedos", "Rói as unhas", "Enrola os cabelos ou puxa a barba"};

        private String idiomaNpc[] = {"Anão","Comum","Élfico","Gigante","Gnômico","Globin","Halflng","Orc","Abissal","Celestial","Dialeto Subterrâneo","Dracônico","Infernal","Primordial","Silvestre","Subcomum"};

        private String profissaoNpc[] = {"Alquimista","Boticário","Ferreiro fino","Chaveiro","Cervejeiro","Armeiro","Destiladore","Viticultore","Calígrafo",
                                         "Escriba","Carpinteiro","Construtor de telhado","Cartógrafo","Desenhista","Sapateiro","Cozinheiro","Padeiro","Vidraceiro","Escultor",
                                         "Joalheiro","Lapidário","Coureiro","Pedreiro","Marceneiro","Pintor","Oleiro","Armador","Ferreiro","Funileiro","Fabricante de carroças",
                                         "Fabricantes de rodas","Tecelão","Entalhador","Construtor de arcos","Acrobata","Engolidor de fogo","Ator","Instrumentista","Bufão",
                                         "Malabarista","Cantor","Dançarino","Poeta","Assaltante","Contrabandista","Assassino de aluguel","Executor","Batedor de carteira",
                                         "Ladrão de estrada","Chantagista","Receptador","Armadilheiro","Caçador de recompensa","Guia","Marinheiro","Soldado","Medico","General",
                                         };



        // =============================================================================================================================================

        private Integer numG = sexoNpc.length-1;
        private Integer numR = racaNpc.length-1;
        private Integer numA = aparenciaNpc.length-1;
        private Integer numC = habilidadesNpc.length-1;
        private Integer numD = donsNpc.length-1;
        private Integer numM = maneirismoNpc.length-1;
        private Integer numT = tracoNpc.length-1;
        private Integer numI = idealNpc.length-1;
        private Integer numV = vinculosNpc.length-1;
        private Integer numS = defesegreNpc.length-1;

        // =============================================================================================================================================
        private int numGenero = (int) Math.round(Math.random() * numG);
        private int numRaca = (int) Math.round(Math.random() * numR);
        private int numAparencia = (int) Math.round(Math.random() * numA);
        private int numCaract = (int) Math.round(Math.random() * numC);
        private int numDons = (int) Math.round(Math.random() * numD);
        private int numManeiro = (int) Math.round(Math.random() * numM);
        private int numTraco = (int) Math.round(Math.random() * numT);
        private int numIdeal = (int) Math.round(Math.random() * numI);
        private int numVinculo = (int) Math.round(Math.random() * numV);
        private int numSegredo = (int) Math.round(Math.random() * numS);

        // =============================================================================================================================================


        int getNumGenero() {
            return numGenero;
        }
        int getNumRaca() {
            return numRaca;
        }
        int getNumCaract() {
            return numCaract;
        }
        int getNumDons() {
            return numDons;
        }
        int getNumManeiro() {
            return numManeiro;
        }
        int getNumTraco() {
            return numTraco;
        }
        int getNumIdeal() {
            return numIdeal;
        }
        int getNumVinculo() {
            return numVinculo;
        }
        int getNumSegredo() {
            return numSegredo;
        }
        int getNumAparencia() {
            return numAparencia;
        }


        // =============================================================================================================================================

        String pegaGenero(int numGenero){
            return sexoNpc[numGenero];
        }

        String pegaRaca (int numRaca){
            return racaNpc[numRaca];
        }

        String pegaAparencia (int numAparencia){
            return aparenciaNpc[numAparencia];
        }

        String pegaCaract (int numCaract){
            return habilidadesNpc[numCaract];
        }

        String pegaDom (int numDons){
            return donsNpc[numDons];
        }

        String pegaManeiro (int numManeiro){
            return maneirismoNpc[numManeiro];
        }

        String pegaTraco (int numTraco){
            return tracoNpc[numTraco];
        }

        String pegaIdeal (int numIdeal){
            return idealNpc[numIdeal];
        }

        String pegaVinculo (int numVinculo){
            return vinculosNpc[numVinculo];
        }

        String pegaSegredo (int numSegredo){
            return defesegreNpc[numSegredo];
        }

    }
