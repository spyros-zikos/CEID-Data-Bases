import random


path1 = './'

tables = []
table_names = ["branch", "worker", "IT", "admin", "manages", "phones", "driver", "guide", "language", "trip", "event", "destination", "travel_to", "reservation", "reservation_offers"] 

branch = []
worker = []
IT = []
admin = []
manages = []
phones = []
driver = []
guide = []
language = []
trip = []
event = []
destination = []
travel_to = []
reservation = []
reservation_offers = []


#branch
streets = ["Josef Stanislaus",
    "Albach-Gasse",
    "Römerweg",
    "Sanktstraße",
    "Antonistraße",
    "Augartenweg",
    "Axerweg",
    "Bahnhofsplatz",
    "Bahnstraße",
    "Bankgasse",
    "Beethovenweg",
    "Bergstraße",
    "Eisbachstraße",
    "Blumengasse",
    "Bründlfeldweg",
    "Buchgrabenweg",
    "Bürgerspitalgasse",
    "Burgstallgasse",
    "Martino Carlone-Gasse",
    "Dr. Robert Davy-Gasse"]
cities = ["Aggsbach",
    "Aichbach",
    "Aichdorf",
    "Aifersdorf","Ebensee",
    "Ebenthal",
    "Ebergassing",
    "Eberndorf", "Fliess",
    "Flinsdorf",
    "Foederlach",
    "Fohnsdorf","Gollersdorf",
    "Golling an der Salzach",
    "Gols",
    "Gortipohl","Hausleiten",
    "Hausmannstatten",
    "Hautzendorf",
    "Heidenreichstein" ]

for i in range(10): #max 20
    reg = []
    id = i+1
    br_street = streets[i]
    num = random.randint(1,50)
    br_city = cities[i]

    #reg.append(id)
    reg.append("NULL")
    reg.append(br_street)
    reg.append(num)
    reg.append(br_city)

    branch.append(reg)

#worker

wrk_name = [
"Aaren",
"Aarika",
"Aaron",
"Aaronson",
"Crean",
"Creath",
"Creedon",
"Creigh",
"Etheline",
"Ethelred",
"Ethelstan",
"Ethelyn",
"Lach",
"Lachance",
"Lachish",
"Lachlan",
"Nadia",
"Nadine",
"Nadiya",
"Nadler"]
wrk_lname = ["Smith","Johnson","Williams","Brown","Jones","Miller","Davis","Garcia","Rodriguez","Wilson","Martinez","Anderson","Taylor","Thomas","Hernandez","Moore","Martin","Jackson","Thompson","White"]

for i in range(43): #new
    reg = []
    wrk_AT = "AM" + str(random.randint(1000000,9999999))
    name = random.choice(wrk_name)
    last_name = random.choice(wrk_lname)
    wrk_salary = str(random.randint(1,5)*1000)
    wrk_br_code = i%10+1#random.randint(1,10)

    reg.append(wrk_AT)
    reg.append(name)
    reg.append(last_name)
    reg.append(wrk_salary)
    reg.append(wrk_br_code)

    worker.append(reg)

#IT
s_date = []
e_date = []
num_of_its = 3
active_it = ""
for i in range(num_of_its):
    s_date.append(f"2015-01-{i%10+10}")
    e_date.append(f"2025-12-{i%10+13}")
for i in range(num_of_its): #new
    reg = []
    IT_AT = worker[i+40][0]
    password = 'DEFAULT'
    start_date = s_date[i]
    end_date = e_date[i]
    active = ''
    reg.append(IT_AT)
    reg.append(password)
    reg.append(start_date)
    reg.append('NULL')
    if i==0:
        reg.append('ACTIVE')
        active_it = IT_AT
    else:
        reg.append('INACTIVE')
    IT.append(reg)
    

#admin
for i in range(10):
    reg = []
    adm_AT = worker[i][0]
    adm_type = 'ADMINISTRATIVE'
    adm_diploma = random.choice(['Managment', 'Oikonomika & Management'])

    reg.append(adm_AT)
    reg.append(adm_type)
    reg.append(adm_diploma) 

    admin.append(reg)

for i in range(10):
    reg = []
    adm_AT = worker[i+10][0]
    adm_type = random.choice(['LOGISTICS','ACCOUNTING'])
    adm_diploma = random.choice(['Oikonomika', 'Oikonomika & Management'])

    reg.append(adm_AT)
    reg.append(adm_type)
    reg.append(adm_diploma) 

    admin.append(reg)

#manages
for i in range(10):
    reg = []
    mng_adm_AT = admin[i][0]
    mng_br_code = i+1

    reg.append(mng_adm_AT)
    reg.append(mng_br_code)

    manages.append(reg)

#phones
for i in range(13):
    reg = []
    ph_br_code = i%10+1 
    ph_number = 2610000000 + (random.randint(1,9)*pow(10,5)) + (random.randint(1,9)*pow(10,4)) + (random.randint(1,9)*pow(10,3)) + (random.randint(1,9)*pow(10,2)) + (random.randint(1,9)*pow(10,1)) + (random.randint(1,9)*pow(10,0)) 
    
    reg.append(ph_br_code)
    reg.append(ph_number)

    phones.append(reg)

#driver
for i in range(10):
    reg = []
    drv_AT = worker[i+20][0] 
    drv_license = random.choice(['A','B','C','D'])
    drv_route = random.choice(['LOCAL','ABROAD'])
    drv_experience = random.randint(0,100)

    reg.append(drv_AT)
    reg.append(drv_license)
    reg.append(drv_route)
    reg.append(drv_experience)

    driver.append(reg)

#guide
for i in range(10):
    reg = [] 
    gui_AT = worker[i+30][0] 
    gui_cv = "Guide " + str(i+1) + " CV" 

    reg.append(gui_AT)   
    reg.append(gui_cv)

    guide.append(reg)   

#language
languages = ["Albanian", "German", "Hindi", "Russian", "Serbian", "Chinese", "Greek", "Portuguese", "French", "English", "Sweedish", "Polish"]
for i in range(15):
    reg = []
    lng_gui_AT = worker[30+(i%10)][0]
    
    lng_language = languages[i%12]

    reg.append(lng_gui_AT)
    reg.append(lng_language)

    language.append(reg)

#YYYY-MM-DD HH:MM:SS
#trip
departure_dates = []
return_dates = []
for i in range(20):
    departure_dates.append(f"2022-11-{i%10+10} 09:00:00")
    return_dates.append(f"2022-12-{i%10+13} 12:00:00")

for i in range(20):
    reg = []
    tr_id = i+1
    tr_departure = departure_dates[i]
    tr_return = return_dates[i]
    tr_maxseats = random.randint(25,35)
    tr_cost = random.randint(5,10)*100
    tr_br_code = i%10+1#branch[i%10][0]
    tr_gui_AT = worker[i%10+30][0]#worker[i%10+30][0] 
    tr_drv_AT = worker[i%10+20][0]#worker[i%10+20][0]
 

    #reg.append(tr_id)
    reg.append("NULL")
    reg.append(tr_departure)
    reg.append(tr_return)
    reg.append(tr_maxseats)
    reg.append(tr_cost)
    reg.append(tr_br_code)
    reg.append(tr_gui_AT)
    reg.append(tr_drv_AT)

    trip.append(reg)


#event
departure_dates = []
return_dates = []
for i in range(20):
    departure_dates.append(f"2022-11-{i%10+10} 09:00:00")
    return_dates.append(f"2022-12-{i%10+13} 12:00:00")

for i in range(20):
    reg = []
    ev_tr_id = i+1
    ev_start = departure_dates[i]
    ev_end = return_dates[i]
    ev_descr = "Event "+str(i+1)+" Description!"

    reg.append(ev_tr_id)
    reg.append(ev_start)
    reg.append(ev_end)
    reg.append(ev_descr)

    event.append(reg)


#destination
departure_dates = []
return_dates = []
destinations = {"Albanian":"Albania", 
                "German":"Germany", 
                "Hindi":"India", 
                "Russian":"Russia", 
                "Serbian":"Serbia", 
                "Chinese":"China", 
                "Greek":"Greece", 
                "Portuguese":"Portugal", 
                "French":"France", 
                "English":"UK", 
                "Sweedish":"Sweeden", 
                "Polish":"Poland"}
test = ["Tirana, Albania",
                "Alger, Algeria",
                "Manila, Philippines",
                "Belgrade, Serbia",
                "N'Djam, Chad",

                "Santiago de Chile, Chile",
                "Peking, China",
                "Singapore, Singapore",
                "Riyadh, Saudi Arabia",
                "Bratislava, Slovakia",

                "Suva, Fiji Islands",
                "Kuwait, Kuwait",
                "Bishkek, Kyrgyzstan",
                "Vientiane, Laos",
                "Riga, Latvia",

                "Asunción, Paraguay",
                "Lima, Peru",
                "Pretoria, South Africa",
                "Seoul, South Korea",
                "Warszawa, Poland"]

for i in range(20):
    departure_dates.append(f"2022-11-{i%10+10} 09:00:00")
    return_dates.append(f"2022-12-{i%10+13} 12:00:00")

for i in range(20):
    reg = []
    dst_id = i+1
    dst_name = destinations[languages[i%10]]
    dst_descr = 'Cool Place!'  #manually
    dst_rtype = driver[i%10][2]
    dst_language = languages[i%10]
    dst_location = "NULL"

    #reg.append(dst_id)
    reg.append("NULL")
    reg.append(dst_name)
    reg.append(dst_descr)
    reg.append(dst_rtype)
    reg.append(dst_language)
    reg.append(dst_location)


    destination.append(reg)


#travel_to
departure_dates = []
return_dates = []
for i in range(20):
    departure_dates.append(f"2022-11-{i%10+10} 09:00:00")
    return_dates.append(f"2022-12-{i%10+13} 12:00:00")

for i in range(20):
    reg = []
    to_tr_id = i + 1
    to_dst_id = i + 1
    to_arrival = departure_dates[i]
    to_departure = return_dates[i]

    reg.append(to_tr_id)
    reg.append(to_dst_id)
    reg.append(to_arrival)
    reg.append(to_departure)

    travel_to.append(reg)


#reservation
names = "Abisha","Adalard","Adelheid","Adora","Agathy","Aia","Akeyla","Albertina","Aleck","Alfie","Alithia","Allyn","Alten","Amabil","Amberly","Ammamaria","Ancel","Andy","Ankney","Anselme","Apollus","Ardeen","Arianie","Armand","Artair","Ashelman","Asuncion","Aube","Aulea","Averyl","Babara","Baker","Banky","Barger","Barthelemy","Baten","Beal","Bee","Belicia","Benia","Bergeman","Bernat","Beryl","Bevers","Bili","Bittner","Blaze","Bobbe","Boiney","Bonny","Bose","Boyce","Branca","Breech","Bride","Brittaney","Brookhouse","Bryn","Bull","Burkitt","Bushweller","Cadmann","Calla","Campagna","Capriola","Carlee","Carnes","Carver","Castor","Cavallaro","Celine","Chainey","Charbonnier","Chaunce","Cherlyn","Ching","Christian","Cianca","Citron","Claudina","Clere","Clyve","Cohlette","Colon","Conias","Cooke","Corell","Corrina","Countess","Crawley","Cristobal","Cullie","Cyb","Dacy","Dalury","Daniela","Darda","Daryn","De","Deedee","Delmar","Denie","Derril","Devland","Diarmuid","Dimitri","Dniren","Dolphin","Donica","Dorinda","Doty","Dream","Dryfoos","Dunham","Dustie","Eachelle","Eberto","Edina","Edyth","Eisenstark","Eleanore","Elish","Elmaleh","Elvis","Emiline","Eng","Er","Erland","Eryn","Ethan","Eula","Evelyn","Ezmeralda","Fairman","Farleigh","Faus","Feil","Fenner","Ferullo","Fillander","Fisk","Flip","Folger","Foskett","Franky","Fredette","Friend","Fullerton","Gadmann","Gamali","Garibald","Gaspar","Gayelord","Gemina","Georgetta","Germana","Giamo","Gilberto","Gina","Giuditta","Glick","Goer","Gonroff","Gotcher","Granger","Greenstein","Griffis","Grosvenor","Guinna","Guthrey","Hadik","Haldane","Hamal","Hankins","Hardman","Harriette","Hasseman","Hayman","Hedda","Heise","Henden","Hepsiba","Hersch","Hewie","Hildegarde","Hiroshi","Hofstetter","Holtorf","Horne","Howlond","Hugues","Hurless","Hyozo","Ieso","Ilsa","Ingold","Iridis","Isidora","Ivey","Jacoba","Jaime ","Janelle","Jaquith","Jaye","Jegar","Jennee","Jerrol","Jillana","Jocelyne","Johnson","Joost","Josy","Julia","Justinian","Kale","Kannan","Karlie","Kast","Katy","Keeley","Kellie","Kennett","Kerrill","Kho","Kimber","Kiran","Klaus","Knowles","Kondon","Koser","Krein","Kroll","Kurth","LaMori","Laith","Lanctot","Lanti","Lasky","Laud","Laverna","Leander","Leff","Lemcke","Leonanie","Let","Lewert","Lichter","Lilybel","Linker","Lissak","Locke","Longerich","Lorianna","Lou","Luane","Ludeman","Lundin","Lyman","MacCarthy","Madai","Mafalda","Maia","Malda","Malvina","Manuel","Marcy","Marian","Maris","Marmawke","Martens","Marylin","Mathilda","Maurene","Maye","McCormick","McLain","Medarda","Melamie","Mellman","Meras","Merrick","Micco","Mignon","Millburn","Minne","Mittel","Mokas","Montfort","Moritz","Moth","Mun","Mutz","Nadaba","Nananne","Nason","Nazler","Nelie","Nesta","Newton","Nicolina","Ninetta","Noellyn","Norling","Nuli","Oberheim","Ody","Oler","Olympie","Oralia","Orlena","Orville","Other","Driscoll","Pain","Panter","Parry","Patrizio","Paynter","Pegma","Pentheas","Perrie","Pettifer","Philbo","Phyllida","Pineda","Plath","Pollux","Posehn","Preuss","Proulx","Puritan","Quinlan","Raddie","Raimes","Ran","Ras","Raynah","Redmer","Reinaldo","Renelle","Rexfourd","Ricard","Ridglee","Rior","Robbins","Rocky","Rois","Ron","Rosalyn","Rosetta","Rowan","Rubia","Rumpf","Ruttger","Saddler","Salbu","Samantha","Sandy","Sarilda","Saw","Schear","Scholz","Scoles","Secor","Seldun","September","Sewel","Shanleigh","Shaylyn","Shenan","Sherye","Sholes","Sibella","Sig","Silvester","Sisely","Slack","Soble","Sonstrom","Spanos","Squier","Stanwinn","Steffie","Stevie","Storm","Stu","Sum","Suzanne","Swope","Tacy","Tallu","Tanney","Tavey","Tekla","Teriann","Thackeray","Theodosia","Thomasin","Thurstan","Tilla","Tish","Tomas","Torey","Tracay","Tressa","Tristis","Tu","Ty","Ulda","Urana","Utham","Valdis","Vanden","Vasta","Veradia","Vezza","Vincents","Vitoria","Voltmer","Wait","Walter","Warring","Webber","Weissmann","Wernher","Whetstone","Wilber","Williamson","Winfrid","Wittenburg","Woodrow","Wymore","Yann","Yoho","Yun","Zamir","Zela","Zimmermann","Zondra"
last_names = ["Smith","Johnson","Williams","Brown","Jones","Miller","Davis","Garcia","Rodriguez","Wilson","Martinez","Anderson","Taylor","Thomas","Hernandez","Moore","Martin","Jackson","Thompson","White","Lopez","Lee","Gonzalez","Harris","Clark","Lewis","Robinson","Walker","Perez","Hall","Young","Allen","Sanchez","Wright","King","Scott","Green","Baker","Adams","Nelson","Hill","Ramirez","Campbell","Mitchell","Roberts","Carter","Phillips","Evans","Turner","Torres","Parker","Collins","Edwards","Stewart","Flores","Morris","Nguyen","Murphy","Rivera","Cook","Rogers","Morgan","Peterson","Cooper","Reed","Bailey","Bell","Gomez","Kelly","Howard","Ward","Cox","Diaz","Richardson","Wood","Watson","Brooks","Bennett","Gray","James","Reyes","Cruz","Hughes","Price","Myers","Long","Foster","Sanders","Ross","Morales","Powell","Sullivan","Russell","Ortiz","Jenkins","Gutierrez","Perry","Butler","Barnes","Fisher","Henderson","Coleman","Simmons","Patterson","Jordan","Reynolds","Hamilton","Graham","Kim","Gonzales","Alexander","Ramos","Wallace","Griffin","West","Cole","Hayes","Chavez","Gibson","Bryant","Ellis","Stevens","Murray","Ford","Marshall","Owens","Mcdonald","Harrison","Ruiz","Kennedy","Wells","Alvarez","Woods","Mendoza","Castillo","Olson","Webb","Washington","Tucker","Freeman","Burns","Henry","Vasquez","Snyder","Simpson","Crawford","Jimenez","Porter","Mason","Shaw","Gordon","Wagner","Hunter","Romero","Hicks","Dixon","Hunt","Palmer","Robertson","Black","Holmes","Stone","Meyer","Boyd","Mills","Warren"]
for i in range(200):
    reg = []
    res_tr_id = i%20 + 1
    res_seatnum = 1                           # i%10 + 51
    res_name = random.choice(names)
    res_lname = random.choice(last_names)
    res_isadult = random.choice(("ADULT", "MINOR"))

    reg.append(res_tr_id)
    reg.append(res_seatnum)
    reg.append(res_name)
    reg.append(res_lname)
    reg.append(res_isadult)

    reservation.append(reg)





#reservation offers
with open(path1 + 'names.txt', 'r',encoding='utf-16') as f: 
    line=f.readline()   
    names = []
    lnames = []
    while (line!= ''):
        names.append(line.split()[0])
        lnames.append(line.split()[1])
        line=f.readline()


for i in range(60000):
    reg = []
    res_off_id = i+1
    res_off_ln = lnames[i%10000]
    res_off_fn = names[i%10000]
    res_off_off_id = random.randint(1,3)
    res_off_prepay = random.randint(50,200)

    reg.append(res_off_id)
    reg.append(res_off_ln)
    reg.append(res_off_fn)
    reg.append(res_off_off_id)
    reg.append(res_off_prepay)
    reservation_offers.append(reg)




tables.append(branch)
tables.append(worker)
tables.append(IT)
tables.append(admin)
tables.append(manages)
tables.append(phones)
tables.append(driver)
tables.append(guide)
tables.append(language)
tables.append(trip)
tables.append(event)
tables.append(destination)
tables.append(travel_to)
tables.append(reservation)
tables.append(reservation_offers)



#tables[branch[record[field]]]
line = ''
for i in range(len(tables)):
    if i == (len(tables)-2):
        line += ("\ninsert into offers values(NULL, '2023-11-18', '2023-11-28', 800, 2);\n"+
        "insert into offers values(NULL, '2023-06-18', '2023-06-25', 500, 6);\n"+
        "insert into offers values(NULL, '2023-03-18', '2023-03-23', 300, 9);\n\n\n")

    for k in range(len(tables[i])):
        line += 'INSERT INTO ' + table_names[i] + '\n'
        line += 'values('
        for j in range(len(tables[i][0])):
            
            
            string = 1
            if str(tables[i][k][j]) == "NULL" or str(tables[i][k][j]) == "DEFAULT":
                string = 0
            else:
                try:
                    int(tables[i][k][j])
                    string = 0
                except:
                    string = 1
            if string:
                line+="\'"
            line += str(tables[i][k][j])
            if string:
                line+="\'"

            if j != len(tables[i][0]) - 1:
                line += ','
        line += ');\n\n'

line += f"\n\nupdate it set active='INACTIVE' where IT_AT='{active_it}';\n"   # log out the it


with open(path1 + '3.insert.txt', 'w', encoding='utf-8') as the_file:
    the_file.write(line + '\n')


