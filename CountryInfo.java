/*
 * Copyright (C) 2012-2013 Neo Visionaries Inc.
 * Copyright (C) 2013      Redger Liensun <redger.liensun@gmail.com>
 * 
 * Original source code from: Takahiko Kawasaki
 * https://github.com/TakahikoKawasaki/nv-i18n
 *
 * Modified by Redger Liensun
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tools;

import java.util.HashMap;
import java.util.Map;

/**
 * Misc codes about countries.
 *
 * <p>
 * Enum names of this enum themselves are represented by
 * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-3">ISO 3166-1 alpha-3</a>
 * code (3-letter upper-case alphabets). There are instance methods to get the
 * country name ({@link #getCountryName()}), the
 * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2" >ISO 3166-1 alpha-2</a>
 * code ({@link #getISOa2()}) and the
 * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_numeric">ISO 3166-1 numeric</a>
 * code ({@link #getISONum()}).
 * In addition, there are static methods to get a CountryInfo instance that
 * corresponds to a given alpha-3/alpha-2/numeric code ({@link #forISO(String)},
 * {@link #forISO(int)}).
 * </p>
 *
 * <pre>
 * <span style="color: darkgreen;">// Get a CountryInfo instance by ISO 3166-1 code.</span>
 * CountryInfo ci = CountryInfo.{@link #forISO(String) forISO}("JP");
 *
 * <span style="color: darkgreen;">// Print all the information. Output will be:</span>
 * <span style="color: darkgreen;">//</span>
 * <span style="color: darkgreen;">//     Country name            = Japan</span>
 * <span style="color: darkgreen;">//     ISO 3166-1 alpha-3 code = JPN</span>
 * <span style="color: darkgreen;">//     ISO 3166-1 alpha-2 code = JP</span>
 * <span style="color: darkgreen;">//     ISO 3166-1 numeric code = 392</span>
 * <span style="color: darkgreen;">//</span>
 * System.out.println("Country name            = " + code.{@link #getCountryName()});
 * System.out.println("ISO 3166-1 alpha-2 code = " + code.{@link #getISOa3()});
 * System.out.println("ISO 3166-1 alpha-3 code = " + code.{@link #getISOa2()});
 * System.out.println("ISO 3166-1 numeric code = " + code.{@link #getNumeric()});
 * </pre>
 *
 * @author Takahiko Kawasaki
 * @author Redger Liensun
 */
public enum CountryInfo {
	
	// 249 countries listed below
	// Data source: http://www.statoids.com/wab.html
	
	ABW("AW", 533, "ABW", "AA", "ARU", "ARU", "", "NU", "14", "aw", "297", "Aruba", "Part of NL"),
	AFG("AF",   4, "AFG", "AF", "AFG", "AFG", "AFG", "AF", "1", "af", "93", "Afghanistan", "Yes"),
	AGO("AO",  24, "AGL", "AO", "ANG", "ANG", "", "AN", "8", "ao", "244", "Angola", "Yes"),
	AIA("AI", 660, "AIA", "AV", "AIA", "AIA", "", "", "9", "am", "1-264", "Anguilla", "Territory of GB"),
	ALA("AX", 248,    "", "", "", "ALD", "FIN", "", "1242", "", "358", "Åland", "Part of FI"),
	ALB("AL",   8, "ALB", "AL", "ALB", "ALB", "AL", "AB", "3", "aa", "355", "Albania", "Yes"),
	AND("AD",  20, "AND", "AN", "AND", "AND", "AND", "", "7", "an", "376", "Andorra", "Yes"),
	ARE("AE", 784, "UAE", "AE", "UAE", "UAE", "", "ER", "255", "ts", "971", "United Arab Emirates", "Yes"),
	ARG("AR",  32, "ARG", "AR", "ARG", "ARG", "RA", "AG", "12", "ag", "54", "Argentina", "Yes"),
	ARM("AM",  51, "ARM", "AM", "ARM", "ARM", "AM", "AY", "13", "ai", "374", "Armenia", "Yes"),
	ASM("AS",  16, "SMA", "AQ", "ASA", "ASA", "USA", "", "5", "as", "1-684", "American Samoa", "Territory of US"),
	ATA("AQ",  10,    "", "AY", "", "ROS3", "", "AA", "10", "ay", "672", "Antarctica", "International"),
	ATF("TF", 260,    "", "FS", "", "", "F", "", "88", "fs", "262", "French Southern Lands", "Territory of FR"),
	ATG("AG",  28, "ATG", "AC", "ANT", "ATG", "", "AT", "11", "aq", "1-268", "Antigua and Barbuda", "Yes"),
	AUS("AU",  36, "AUS", "AS", "AUS", "AUS", "AUS", "AU", "17", "at", "61", "Australia", "Yes"),
	AUT("AT",  40, "AUT", "AU", "AUT", "AUT", "A", "OS", "18", "au", "43", "Austria", "Yes"),
	AZE("AZ",  31, "AZE", "AJ", "AZE", "AZE", "AZ", "AJ", "19", "aj", "994", "Azerbaijan", "Yes"),
	BDI("BI", 108, "BDI", "BY", "BDI", "BDI", "RU", "BI", "43", "bd", "257", "Burundi", "Yes"),
	BEL("BE",  56, "BEL", "BE", "BEL", "BEL", "B", "BX", "27", "be", "32", "Belgium", "Yes"),
	BEN("BJ", 204, "BEN", "BN", "BEN", "BEN", "DY", "BJ", "29", "dm", "229", "Benin", "Yes"),
	BES("BQ", 535, "ATN", "NL", "AHO", "ANT", "NA", "NU", "176", "ca", "599", "Bonaire, Sint Eustatius and Saba", "Part of NL"),
	BFA("BF", 854, "BFA", "UV", "BUR", "BFA", "BF", "HV", "42", "uv", "226", "Burkina Faso", "Yes"),
	BGD("BD",  50, "BGD", "BG", "BAN", "BAN", "BD", "BW", "23", "bg", "880", "Bangladesh", "Yes"),
	BGR("BG", 100, "BUL", "BU", "BUL", "BUL", "BG", "BU", "41", "bu", "359", "Bulgaria", "Yes"),
	BHR("BH",  48, "BHR", "BA", "BRN", "BHR", "BRN", "BN", "21", "ba", "973", "Bahrain", "Yes"),
	BHS("BS",  44, "BAH", "BF", "BAH", "BAH", "BS", "BA", "20", "bf", "1-242", "Bahamas", "Yes"),
	BIH("BA",  70, "BIH", "BK", "BIH", "BIH", "BIH", "BG", "34", "bn", "387", "Bosnia and Herzegovina", "Yes"),
	BLM("BL", 652,    "", "TB", "", "", "", "", "", "sc", "590", "Saint Barthélemy", "Part of FR"),
	BLR("BY", 112, "BLR", "BO", "BLR", "BLR", "BY", "BY", "26", "bw", "375", "Belarus", "Yes"),
	BLZ("BZ",  84, "BLZ", "BH", "BIZ", "BLZ", "BZ", "BH", "28", "bh", "501", "Belize", "Yes"),
	BMU("BM",  60, "BER", "BD", "BER", "BER", "", "BE", "30", "bm", "1-441", "Bermuda", "Territory of GB"),
	BOL("BO",  68, "BOL", "BL", "BOL", "BOL", "BOL", "BO", "33", "bo", "591", "Bolivia", "Yes"),
	BRA("BR",  76,   "B", "BR", "BRA", "BRA", "BR", "BZ", "37", "bl", "55", "Brazil", "Yes"),
	BRB("BB",  52, "BRB", "BB", "BAR", "BRB", "BDS", "BR", "24", "bb", "1-246", "Barbados", "Yes"),
	BRN("BN",  96, "BRU", "BX", "BRU", "BRU", "BRU", "BD", "40", "bx", "673", "Brunei Darussalam", "Yes"),
	BTN("BT",  64, "BTN", "BT", "BHU", "BHU", "", "", "31", "bt", "975", "Bhutan", "Yes"),
	BVT("BV",  74,    "", "BV", "", "", "", "BV", "36", "bv", "47", "Bouvet Island", "Territory of NO"),
	BWA("BW",  72, "BOT", "BC", "BOT", "BOT", "BW", "BC", "35", "bs", "267", "Botswana", "Yes"),
	CAF("CF", 140, "CAF", "CT", "CAF", "CTA", "RCA", "CE", "49", "cx", "236", "Central African Republic", "Yes"),
	CAN("CA", 124, "CAN", "CA", "CAN", "CAN", "CDN", "CN", "46", "xxc", "1", "Canada", "Yes"),
	CCK("CC", 166, "ICO", "CK", "", "CCK", "AUS", "KK", "56", "xb", "61", "Cocos (Keeling) Islands", "Territory of AU"),
	CHE("CH", 756, "SUI", "SZ", "SUI", "SUI", "CH", "SW", "237", "sz", "41", "Switzerland", "Yes"),
	CHL("CL", 152, "CHL", "CI", "CHI", "CHI", "RCH", "CH", "51", "cl", "56", "Chile", "Yes"),
	CHN("CN", 156, "CHN", "CH", "CHN", "CHN", "", "CI", "53", "cc", "86", "China", "Yes"),
	CIV("CI", 384, "CTI", "IV", "CIV", "CIV", "CI", "IV", "66", "iv", "225", "Côte d'Ivoire", "Yes"),
	CMR("CM", 120, "CME", "CM", "CMR", "CMR", "CAM", "CM", "45", "cm", "237", "Cameroon", "Yes"),
	COD("CD", 180, "COD", "CG", "COD", "COD", "ZRE", "ZR", "68", "cg", "243", "Congo (Kinshasa)", "Yes"),
	COG("CG", 178, "COG", "CF", "CGO", "CGO", "RCB", "CG", "59", "cf", "242", "Congo (Brazzaville)", "Yes"),
	COK("CK", 184, "CKH", "CW", "COK", "COK", "NZ", "KU", "60", "cw", "682", "Cook Islands", "Associated with NZ"),
	COL("CO", 170, "CLM", "CO", "COL", "COL", "CO", "CO", "57", "ck", "57", "Colombia", "Yes"),
	COM("KM", 174, "COM", "CN", "COM", "COM", "", "IC", "58", "cq", "269", "Comoros", "Yes"),
	CPV("CV", 132, "CPV", "CV", "CPV", "CPV", "", "CV", "47", "cv", "238", "Cape Verde", "Yes"),
	CRI("CR", 188, "CTR", "CS", "CRC", "CRC", "CR", "CS", "61", "cr", "506", "Costa Rica", "Yes"),
	CUB("CU", 192, "CUB", "CU", "CUB", "CUB", "C", "CU", "63", "cu", "53", "Cuba", "Yes"),
	CUW("CW", 531,    "", "UC", "", "", "", "", "", "co", "", "Curaçao", "Part of NL"),
	CXR("CX", 162, "CHR", "KT", "", "CXR", "AUS", "KI", "54", "xa", "61", "Christmas Island", "Territory of AU"),
	CYM("KY", 136, "CYM", "CJ", "CAY", "CAY", "", "GC", "48", "cj", "1-345", "Cayman Islands", "Territory of GB"),
	CYP("CY", 196, "CYP", "CY", "CYP", "CYP", "CY", "CY", "64", "cy", "357", "Cyprus", "Yes"),
	CZE("CZ", 203, "CZE", "EZ", "CZE", "CZE", "CZ", "CZ", "65", "xr", "420", "Czech Republic", "Yes"),
	DEU("DE", 276,   "D", "GM", "GER", "GER", "D", "DL", "93", "gw", "49", "Germany", "Yes"),
	DJI("DJ", 262, "DJI", "DJ", "DJI", "DJI", "", "DJ", "70", "ft", "253", "Djibouti", "Yes"),
	DMA("DM", 212, "DMA", "DO", "DMA", "DMA", "WD", "DO", "71", "dq", "1-767", "Dominica", "Yes"),
	DNK("DK", 208, "DNK", "DA", "DEN", "DEN", "DK", "DN", "69", "dk", "45", "Denmark", "Yes"),
	DOM("DO", 214, "DOM", "DR", "DOM", "DOM", "DOM", "DR", "72", "dr", "1-809,1-829,1-849", "Dominican Republic", "Yes"),
	DZA("DZ",  12, "ALG", "AG", "ALG", "ALG", "DZ", "AL", "4", "ae", "213", "Algeria", "Yes"),
	ECU("EC", 218, "EQA", "EC", "ECU", "ECU", "EC", "EQ", "73", "ec", "593", "Ecuador", "Yes"),
	EGY("EG", 818, "EGY", "EG", "EGY", "EGY", "ET", "EG", "40765", "ua", "20", "Egypt", "Yes"),
	ERI("ER", 232, "ERI", "ER", "ERI", "ERI", "", "", "77", "ea", "291", "Eritrea", "Yes"),
	ESH("EH", 732, "AOE", "WI", "", "SAH", "", "", "268", "ss", "212", "Western Sahara", "In contention"),
	ESP("ES", 724,   "E", "SP", "ESP", "ESP", "E", "SP", "229", "sp", "34", "Spain", "Yes"),
	EST("EE", 233, "EST", "EN", "EST", "EST", "EST", "EO", "78", "er", "372", "Estonia", "Yes"),
	ETH("ET", 231, "ETH", "ET", "ETH", "ETH", "ETH", "ET", "79", "et", "251", "Ethiopia", "Yes"),
	FIN("FI", 246, "FIN", "FI", "FIN", "FIN", "FIN", "FI", "84", "fi", "358", "Finland", "Yes"),
	FJI("FJ", 242, "FJI", "FJ", "FIJ", "FIJ", "FJI", "FJ", "83", "fj", "679", "Fiji", "Yes"),
	FLK("FK", 238, "FLK", "FK", "FLK", "FLK", "", "FK", "81", "fk", "500", "Falkland Islands", "Territory of GB"),
	FRA("FR", 250, "F", "FR", "FRA", "FRA", "F", "FR", "85", "fr", "33", "France", "Yes"),
	FRO("FO", 234, "FRO", "FO", "FAR", "FRO", "FO", "FA", "82", "fa", "298", "Faroe Islands", "Part of DK"),
	FSM("FM", 583, "FSM", "FM", "FSM", "FSM", "", "", "163", "fm", "691", "Micronesia", "Yes"),
	GAB("GA", 266, "GAB", "GB", "GAB", "GAB", "G", "GO", "89", "go", "241", "Gabon", "Yes"),
	GBR("GB", 826,   "G", "UK", "GBR", "1", "GB", "UK", "256", "xxk", "44", "United Kingdom", "Yes"),
	GEO("GE", 268, "GEO", "GG", "GEO", "GEO", "GE", "GG", "92", "gs", "995", "Georgia", "Yes"),
	GGY("GG", 831,    "", "GK", "", "GBG", "GBG", "", "104", "uik", "44", "Guernsey", "Crown dependency of GB"),
	GHA("GH", 288, "GHA", "GH", "GHA", "GHA", "GH", "GH", "94", "gh", "233", "Ghana", "Yes"),
	GIB("GI", 292, "GIB", "GI", "GIB", "GBZ", "GBZ", "GI", "95", "gi", "350", "Gibraltar", "Territory of GB"),
	GIN("GN", 324, "GUI", "GV", "GUI", "GUI", "RG", "GN", "106", "gv", "224", "Guinea", "Yes"),
	GLP("GP", 312, "GDL", "GP", "GUD", "GLP", "F", "MF", "100", "gp", "590", "Guadeloupe", "Part of FR"),
	GMB("GM", 270, "GMB", "GA", "GAM", "GAM", "WAG", "GB", "90", "gm", "220", "Gambia", "Yes"),
	GNB("GW", 624, "GNB", "PU", "GBS", "GNB", "", "GW", "105", "pg", "245", "Guinea-Bissau", "Yes"),
	GNQ("GQ", 226, "GNE", "EK", "GEQ", "EQG", "", "GQ", "76", "eg", "240", "Equatorial Guinea", "Yes"),
	GRC("GR", 300, "GRC", "GR", "GRE", "GRE", "GR", "GR", "97", "gr", "30", "Greece", "Yes"),
	GRD("GD", 308, "GRD", "GJ", "GRN", "GRN", "WG", "GD", "99", "gd", "1-473", "Grenada", "Yes"),
	GRL("GL", 304, "GRL", "GL", "GRL", "GRL", "DK", "GL", "98", "gl", "299", "Greenland", "Part of DK"),
	GTM("GT", 320, "GTM", "GT", "GUA", "GUA", "GCA", "GU", "103", "gt", "502", "Guatemala", "Yes"),
	GUF("GF", 254, "GUF", "FG", "FGU", "GUF", "F", "FG", "86", "fg", "594", "French Guiana", "Part of FR"),
	GUM("GU", 316, "GUM", "GQ", "GUM", "GUM", "USA", "GM", "101", "gu", "1-671", "Guam", "Territory of US"),
	GUY("GY", 328, "GUY", "GY", "GUY", "GUY", "GUY", "GY", "107", "gy", "592", "Guyana", "Yes"),
	HKG("HK", 344, "HKG", "HK", "HKG", "HKG", "HK", "HK", "33364", "", "852", "Hong Kong", "Part of CN"),
	HMD("HM", 334,    "", "HM", "", "", "AUS", "", "109", "hm", "672", "Heard and McDonald Islands", "Territory of AU"),
	HND("HN", 340, "HND", "HO", "HON", "HON", "", "HO", "111", "ho", "504", "Honduras", "Yes"),
	HRV("HR", 191, "HRV", "HR", "CRO", "CRO", "HR", "RH", "62", "ci", "385", "Croatia", "Yes"),
	HTI("HT", 332, "HTI", "HA", "HAI", "HAI", "RH", "HA", "108", "ht", "509", "Haiti", "Yes"),
	HUN("HU", 348, "HNG", "HU", "HUN", "HUN", "H", "HU", "113", "hu", "36", "Hungary", "Yes"),
	IDN("ID", 360, "INS", "ID", "INA", "IDN", "RI", "ID", "116", "io", "62", "Indonesia", "Yes"),
	IMN("IM", 833,    "", "IM", "", "GBM", "GBM", "", "120", "uik", "44", "Isle of Man", "Crown dependency of GB"),
	IND("IN", 356, "IND", "IN", "IND", "IND", "IND", "IN", "115", "ii", "91", "India", "Yes"),
	IOT("IO",  86, "BIO", "IO", "", "", "", "", "38", "bi", "246", "British Indian Ocean Territory", "Territory of GB"),
	IRL("IE", 372, "IRL", "EI", "IRL", "IRL", "IRL", "IE", "119", "ie", "353", "Ireland", "Yes"),
	IRN("IR", 364, "IRN", "IR", "IRI", "IRN", "IR", "IR", "117", "ir", "98", "Iran", "Yes"),
	IRQ("IQ", 368, "IRQ", "IZ", "IRQ", "IRQ", "IRQ", "IQ", "118", "iq", "964", "Iraq", "Yes"),
	ISL("IS", 352, "ISL", "IC", "ISL", "ISL", "IS", "IL", "114", "ic", "354", "Iceland", "Yes"),
	ISR("IL", 376, "ISR", "IS", "ISR", "ISR", "IL", "IS", "121", "is", "972", "Israel", "Yes"),
	ITA("IT", 380,   "I", "IT", "ITA", "ITA", "I", "IY", "122", "it", "39", "Italy", "Yes"),
	JAM("JM", 388, "JMC", "JM", "JAM", "JAM", "JA", "JM", "123", "jm", "1-876", "Jamaica", "Yes"),
	JEY("JE", 832,    "", "JE", "", "GBJ", "GBJ", "", "128", "uik", "44", "Jersey", "Crown dependency of GB"),
	JOR("JO", 400, "JOR", "JO", "JOR", "JOR", "HKJ", "JD", "130", "jo", "962", "Jordan", "Yes"),
	JPN("JP", 392,   "J", "JA", "JPN", "JPN", "J", "JP", "126", "ja", "81", "Japan", "Yes"),
	KAZ("KZ", 398, "KAZ", "KZ", "KAZ", "KAZ", "KZ", "KZ", "132", "kz", "7", "Kazakhstan", "Yes"),
	KEN("KE", 404, "KEN", "KE", "KEN", "KEN", "EAK", "KN", "133", "ke", "254", "Kenya", "Yes"),
	KGZ("KG", 417, "KGZ", "KG", "KGZ", "KGZ", "KS", "KG", "138", "kg", "996", "Kyrgyzstan", "Yes"),
	KHM("KH", 116, "CBG", "CB", "CAM", "CAM", "K", "KP", "44", "cb", "855", "Cambodia", "Yes"),
	KIR("KI", 296, "KIR", "KR", "KIR", "KIR", "", "KB", "135", "gb", "686", "Kiribati", "Yes"),
	KNA("KN", 659, "KNA", "SC", "SKN", "SKN", "", "AT", "208", "xd", "1-869", "Saint Kitts and Nevis", "Yes"),
	KOR("KR", 410, "KOR", "KS", "KOR", "KOR", "ROK", "KO", "202", "ko", "82", "Korea, South", "Yes"),
	KWT("KW", 414, "KWT", "KU", "KUW", "KUW", "KWT", "KW", "137", "ku", "965", "Kuwait", "Yes"),
	LAO("LA", 418, "LAO", "LA", "LAO", "LAO", "LAO", "LA", "139", "ls", "856", "Laos", "Yes"),
	LBN("LB", 422, "LBN", "LE", "LIB", "LIB", "RL", "LB", "141", "le", "961", "Lebanon", "Yes"),
	LBR("LR", 430, "LBR", "LI", "LBR", "LBR", "LB", "LI", "144", "lb", "231", "Liberia", "Yes"),
	LBY("LY", 434, "LBY", "LY", "LBA", "LBY", "LAR", "LY", "145", "ly", "218", "Libya", "Yes"),
	LCA("LC", 662, "LCA", "ST", "LCA", "LCA", "WL", "LC", "209", "xk", "1-758", "Saint Lucia", "Yes"),
	LIE("LI", 438, "LIE", "LS", "LIE", "LIE", "FL", "", "146", "lh", "423", "Liechtenstein", "Yes"),
	LKA("LK", 144, "CLN", "CE", "SRI", "SRI", "CL", "SB", "231", "ce", "94", "Sri Lanka", "Yes"),
	LSO("LS", 426, "LSO", "LT", "LES", "LES", "LS", "LS", "142", "lo", "266", "Lesotho", "Yes"),
	LTU("LT", 440, "LTU", "LH", "LTU", "LTU", "LT", "LT", "147", "li", "370", "Lithuania", "Yes"),
	LUX("LU", 442, "LUX", "LU", "LUX", "LUX", "L", "BX", "148", "lu", "352", "Luxembourg", "Yes"),
	LVA("LV", 428, "LVA", "LG", "LAT", "LVA", "LV", "LV", "140", "lv", "371", "Latvia", "Yes"),
	MAC("MO", 446, "MAC", "MC", "MAC", "MAC", "", "MU", "149", "", "853", "Macau", "Part of CN"),
	MAF("MF", 663,    "", "RN", "", "", "", "", "", "st", "590", "Saint Martin (French part)", "Part of FR"),
	MAR("MA", 504, "MRC", "MO", "MAR", "MAR", "MA", "MC", "169", "mr", "212", "Morocco", "Yes"),
	MCO("MC", 492, "MCO", "MN", "MON", "MON", "MC", "", "166", "mc", "377", "Monaco", "Yes"),
	MDA("MD", 498, "MDA", "MD", "MDA", "MDA", "MD", "RM", "165", "mv", "373", "Moldova", "Yes"),
	MDG("MG", 450, "MDG", "MA", "MAD", "MAD", "RM", "MG", "150", "mg", "261", "Madagascar", "Yes"),
	MDV("MV", 462, "MLD", "MV", "MDV", "MDV", "", "MV", "154", "xc", "960", "Maldives", "Yes"),
	MEX("MX", 484, "MEX", "MX", "MEX", "MEX", "MEX", "MX", "162", "mx", "52", "Mexico", "Yes"),
	MHL("MH", 584, "MHL", "RM", "MSH", "MHL", "", "MH", "157", "xe", "692", "Marshall Islands", "Yes"),
	MKD("MK", 807, "MKD", "MK", "MKD", "MKD", "MK", "MJ", "241", "xn", "389", "Macedonia", "Yes"),
	MLI("ML", 466, "MLI", "ML", "MLI", "MLI", "RMM", "MI", "155", "ml", "223", "Mali", "Yes"),
	MLT("MT", 470, "MLT", "MT", "MLT", "MLT", "M", "ML", "156", "mm", "356", "Malta", "Yes"),
	MMR("MM", 104, "MYA", "BM", "MYA", "MYA", "BUR", "BM", "171", "br", "95", "Myanmar", "Yes"),
	MNE("ME", 499, "MNE", "MJ", "MGO", "MNE", "(See Serbia)", "2647", "mo", "382", "Yes", "Montenegro", ""),
	MNG("MN", 496, "MNG", "MG", "MGL", "MNG", "MGL", "MO", "167", "mp", "976", "Mongolia", "Yes"),
	MNP("MP", 580, "MRA", "CQ", "NMA", "NMI", "USA", "MY", "185", "nw", "1-670", "Northern Mariana Islands", "Commonwealth of US"),
	MOZ("MZ", 508, "MOZ", "MZ", "MOZ", "MOZ", "MOC", "MZ", "170", "mz", "258", "Mozambique", "Yes"),
	MRT("MR", 478, "MTN", "MR", "MTN", "MTN", "RIM", "MT", "159", "mu", "222", "Mauritania", "Yes"),
	MSR("MS", 500, "MSR", "MH", "MNT", "MSR", "", "", "168", "mj", "1-664", "Montserrat", "Territory of GB"),
	MTQ("MQ", 474, "MRT", "MB", "MRT", "MTQ", "F", "MR", "158", "mq", "596", "Martinique", "Part of FR"),
	MUS("MU", 480, "MAU", "MP", "MRI", "MRI", "MS", "MA", "160", "mf", "230", "Mauritius", "Yes"),
	MWI("MW", 454, "MWI", "MI", "MAW", "MWI", "MW", "MW", "152", "mw", "265", "Malawi", "Yes"),
	MYS("MY", 458, "MLA", "MY", "MAS", "MAS", "MAL", "MS", "153", "my", "60", "Malaysia", "Yes"),
	MYT("YT", 175, "MYT", "MF", "MAY", "MYT", "", "", "161", "ot", "262", "Mayotte", "Part of FR"),
	NAM("NA", 516, "NMB", "WA", "NAM", "NAM", "NAM", "NM", "172", "sx", "264", "Namibia", "Yes"),
	NCL("NC", 540, "NCL", "NC", "NCD", "NCL", "F", "NC", "178", "nl", "687", "New Caledonia", "Territory of FR"),
	NER("NE", 562, "NGR", "NG", "NIG", "NIG", "RN", "NR", "181", "ng", "227", "Niger", "Yes"),
	NFK("NF", 574, "NFK", "NF", "NFI", "NFK", "AUS", "NF", "184", "nx", "672", "Norfolk Island", "Territory of AU"),
	NGA("NG", 566, "NIG", "NI", "NGR", "NGA", "NGR", "NI", "182", "nr", "234", "Nigeria", "Yes"),
	NIC("NI", 558, "NCG", "NU", "NCA", "NCA", "NIC", "NK", "180", "nq", "505", "Nicaragua", "Yes"),
	NIU("NU", 570, "NIU", "NE", "NIU", "NIU", "NZ", "", "183", "xh", "683", "Niue", "Associated with NZ"),
	NLD("NL", 528, "HOL", "NL", "NED", "NED", "NL", "NL", "177", "ne", "31", "Netherlands", "Yes"),
	NOR("NO", 578, "NOR", "NO", "NOR", "NOR", "N", "NO", "186", "no", "47", "Norway", "Yes"),
	NPL("NP", 524, "NPL", "NP", "NEP", "NEP", "NEP", "NP", "175", "np", "977", "Nepal", "Yes"),
	NRU("NR", 520, "NRU", "NR", "NRU", "NRU", "NAU", "NW", "173", "nu", "674", "Nauru", "Yes"),
	NZL("NZ", 554, "NZL", "NZ", "NZL", "NZL", "NZ", "NZ", "179", "nz", "64", "New Zealand", "Yes"),
	OMN("OM", 512, "OMA", "MU", "OMA", "OMA", "", "OM", "187", "mk", "968", "Oman", "Yes"),
	PAK("PK", 586, "PAK", "PK", "PAK", "PAK", "PK", "PK", "188", "pk", "92", "Pakistan", "Yes"),
	PAN("PA", 591, "PNR", "PM", "PAN", "PAN", "PA", "PM", "191", "pn", "507", "Panama", "Yes"),
	PCN("PN", 612, "PTC", "PC", "", "PCN", "", "PT", "197", "pc", "870", "Pitcairn", "Territory of GB"),
	PER("PE", 604, "PRU", "PE", "PER", "PER", "PE", "PR", "195", "pe", "51", "Peru", "Yes"),
	PHL("PH", 608, "PHL", "RP", "PHI", "PHI", "RP", "PH", "196", "ph", "63", "Philippines", "Yes"),
	PLW("PW", 585, "PLW", "PS", "PLW", "PLW", "", "", "189", "pw", "680", "Palau", "Yes"),
	PNG("PG", 598, "PNG", "PP", "PNG", "PNG", "PNG", "NG", "192", "pp", "675", "Papua New Guinea", "Yes"),
	POL("PL", 616, "POL", "PL", "POL", "POL", "PL", "PL", "198", "pl", "48", "Poland", "Yes"),
	PRI("PR", 630, "PTR", "RQ", "PUR", "PUR", "USA", "PU", "200", "pr", "1", "Puerto Rico", "Commonwealth of US"),
	PRK("KP", 408, "KRE", "KN", "PRK", "PRK", "", "KR", "67", "kn", "850", "Korea, North", "Yes"),
	PRT("PT", 620, "POR", "PO", "POR", "POR", "P", "PO", "199", "po", "351", "Portugal", "Yes"),
	PRY("PY", 600, "PRG", "PA", "PAR", "PAR", "PY", "PY", "194", "py", "595", "Paraguay", "Yes"),
	PSE("PS", 275,    "", "GZ,WE", "PLE", "PLE", "", "", "91,267", "gz,wj", "970", "Palestine", "In contention"),
	PYF("PF", 258, "OCE", "FP", "FPO", "TAH2", "F", "PF", "87", "fp", "689", "French Polynesia", "Territory of FR"),
	QAT("QA", 634, "QAT", "QA", "QAT", "QAT", "Q", "QT", "201", "qa", "974", "Qatar", "Yes"),
	REU("RE", 638, "REU", "RE", "REU", "REU", "F", "RE", "206", "re", "262", "Reunion", "Part of FR"),
	ROU("RO", 642, "ROU", "RO", "ROU", "ROU", "RO", "RO", "203", "rm", "40", "Romania", "Yes"),
	RUS("RU", 643, "RUS", "RS", "RUS", "RUS", "RUS", "RS", "204", "ru", "7", "Russian Federation", "Yes"),
	RWA("RW", 646, "RRW", "RW", "RWA", "RWA", "RWA", "RW", "205", "rw", "250", "Rwanda", "Yes"),
	SAU("SA", 682, "ARS", "SA", "KSA", "KSA", "SA", "SD", "215", "su", "966", "Saudi Arabia", "Yes"),
	SDN("SD", 729, "SDN", "SU", "SUD", "SUD", "SUD", "SU", "40764", "sj", "249", "Sudan", "Yes"),
	SEN("SN", 686, "SEN", "SG", "SEN", "SEN", "SN", "SG", "217", "sg", "221", "Senegal", "Yes"),
	SGP("SG", 702, "SNG", "SN", "SIN", "SIN", "SGP", "SR", "222", "si", "65", "Singapore", "Yes"),
	SGS("GS", 239,    "", "SX", "", "", "", "", "228", "xs", "500", "South Georgia and South Sandwich Islands", "Territory of GB"),
	SHN("SH", 654, "SHN", "SH", "HEL", "SHN", "", "HE", "207", "xj", "290", "Saint Helena", "Territory of GB"),
	SJM("SJ", 744, "NOR", "SV,JN", "", "", "", "SZ", "234", "", "47", "Svalbard and Jan Mayen Islands", "Territory of NO"),
	SLB("SB",  90, "SLM", "BP", "SOL", "SOL", "", "SO", "225", "bp", "677", "Solomon Islands", "Yes"),
	SLE("SL", 694, "SRL", "SL", "SLE", "SLE", "WAL", "SL", "221", "sl", "232", "Sierra Leone", "Yes"),
	SLV("SV", 222, "SLV", "ES", "ESA", "SLV", "ES", "ES", "75", "es", "503", "El Salvador", "Yes"),
	SMR("SM", 674, "SMR", "SM", "SMR", "SMR", "RSM", "", "213", "sm", "378", "San Marino", "Yes"),
	SOM("SO", 706, "SOM", "SO", "SOM", "SOM", "SO", "SI", "226", "so", "252", "Somalia", "Yes"),
	SPM("PM", 666, "SPM", "SB", "SPM", "SPM", "F", "FP", "210", "xl", "508", "Saint Pierre and Miquelon", "Part of FR"),
	SRB("RS", 688, "SRB", "RI,KV", "SRB", "SRB", "SCG", "YG", "2648", "rb", "381", "Serbia", "Yes"),
	SSD("SS", 728, "SSD", "OD", "", "", "", "", "", "sd", "211", "South Sudan", "Yes"),
	STP("ST", 678, "STP", "TP", "STP", "STP", "", "TP", "214", "sf", "239", "Sao Tome and Principe", "Yes"),
	SUR("SR", 740, "SUR", "NS", "SUR", "SUR", "SME", "SM", "233", "sr", "597", "Suriname", "Yes"),
	SVK("SK", 703, "SVK", "LO", "SVK", "SVK", "SK", "SQ", "223", "xo", "421", "Slovakia", "Yes"),
	SVN("SI", 705, "SVN", "SI", "SLO", "SVN", "SLO", "LJ", "224", "xv", "386", "Slovenia", "Yes"),
	SWE("SE", 752,   "S", "SW", "SWE", "SWE", "S", "SN", "236", "sw", "46", "Sweden", "Yes"),
	SWZ("SZ", 748, "SWZ", "WZ", "SWZ", "SWZ", "SD", "SV", "235", "sq", "268", "Swaziland", "Yes"),
	SXM("SX", 534,    "", "NN", "", "", "", "", "", "sn", "", "Sint Maarten", "Part of NL"),
	SYC("SC", 690, "SEY", "SE", "SEY", "SEY", "SY", "SC", "220", "se", "248", "Seychelles", "Yes"),
	SYR("SY", 760, "SYR", "SY", "SYR", "SYR", "SYR", "SY", "238", "sy", "963", "Syria", "Yes"),
	TCA("TC", 796, "TCA", "TK", "TKS", "TCA", "", "TI", "251", "tc", "1-649", "Turks and Caicos Islands", "Territory of GB"),
	TCD("TD", 148, "TCD", "CD", "CHA", "CHA", "TCH", "CD", "50", "cd", "235", "Chad", "Yes"),
	TGO("TG", 768, "TGO", "TO", "TOG", "TOG", "TG", "TG", "243", "tg", "228", "Togo", "Yes"),
	THA("TH", 764, "THA", "TH", "THA", "THA", "T", "TH", "240", "th", "66", "Thailand", "Yes"),
	TJK("TJ", 762, "TJK", "TI", "TJK", "TJK", "TJ", "TA", "239", "ta", "992", "Tajikistan", "Yes"),
	TKL("TK", 772, "TKL", "TL", "", "TKL", "NZ", "TK", "244", "tl", "690", "Tokelau", "Territory of NZ"),
	TKM("TM", 795, "TKM", "TX", "TKM", "TKM", "TM", "TR", "250", "tk", "993", "Turkmenistan", "Yes"),
	TLS("TL", 626, "TLS", "TT", "TLS", "TLS", "", "TM", "242", "em", "670", "Timor-Leste", "Yes"),
	TON("TO", 776, "TON", "TN", "TGA", "TGA", "", "TO", "245", "to", "676", "Tonga", "Yes"),
	TTO("TT", 780, "TRD", "TD", "TRI", "TRI", "TT", "TD", "246", "tr", "1-868", "Trinidad and Tobago", "Yes"),
	TUN("TN", 788, "TUN", "TS", "TUN", "TUN", "TN", "TS", "248", "ti", "216", "Tunisia", "Yes"),
	TUR("TR", 792, "TUR", "TU", "TUR", "TUR", "TR", "TU", "249", "tu", "90", "Turkey", "Yes"),
	TUV("TV", 798, "TUV", "TV", "TUV", "TUV", "", "TV", "252", "tv", "688", "Tuvalu", "Yes"),
	TWN("TW", 158,    "", "TW", "TPE", "TPE", "RC", "", "925", "ch", "886", "Taiwan", "Yes"),
	TZA("TZ", 834, "TZA", "TZ", "TAN", "TAN", "EAT", "TN", "257", "tz", "255", "Tanzania", "Yes"),
	UGA("UG", 800, "UGA", "UG", "UGA", "UGA", "EAU", "UG", "253", "ug", "256", "Uganda", "Yes"),
	UKR("UA", 804, "UKR", "UP", "UKR", "UKR", "UA", "UR", "254", "un", "380", "Ukraine", "Yes"),
	UMI("UM", 581,    "", "a", "", "", "USA", "", "", "b", "", "United States Minor Outlying Islands", "Territories of US"),
	URY("UY", 858, "URG", "UY", "URU", "URU", "ROU", "UY", "260", "uy", "598", "Uruguay", "Yes"),
	USA("US", 840, "USA", "US", "USA", "USA", "USA", "US", "259", "xxu", "1", "United States of America", "Yes"),
	UZB("UZ", 860, "UZB", "UZ", "UZB", "UZB", "UZ", "UZ", "261", "uz", "998", "Uzbekistan", "Yes"),
	VAT("VA", 336, "CVA", "VT", "", "VAT", "V", "", "110", "vc", "39-06", "Vatican City", "Yes"),
	VCT("VC", 670, "VCT", "VC", "VIN", "VIN", "WV", "VG", "211", "xm", "1-784", "Saint Vincent and the Grenadines", "Yes"),
	VEN("VE", 862, "VEN", "VE", "VEN", "VEN", "YV", "VN", "263", "ve", "58", "Venezuela", "Yes"),
	VGB("VG",  92, "VRG", "VI", "IVB", "VGB", "BVI", "VI", "39", "vb", "1-284", "Virgin Islands, British", "Territory of GB"),
	VIR("VI", 850, "VIR", "VQ", "ISV", "VIR", "USA", "VI", "258", "vi", "1-340", "Virgin Islands, U.S.", "Territory of US"),
	VNM("VN", 704, "VTN", "VM", "VIE", "VIE", "VN", "VS", "264", "vm", "84", "Vietnam", "Yes"),
	VUT("VU", 548, "VUT", "NH", "VAN", "VAN", "", "NV", "262", "nn", "678", "Vanuatu", "Yes"),
	WLF("WF", 876, "WAL", "WF", "WAF", "WLF", "F", "FW", "266", "wf", "681", "Wallis and Futuna Islands", "Territory of FR"),
	WSM("WS", 882, "SMO", "WS", "SAM", "SAM", "WS", "ZM", "212", "ws", "685", "Samoa", "Yes"),
	YEM("YE", 887, "YEM", "YM", "YEM", "YEM", "YAR", "YE", "269", "ye", "967", "Yemen", "Yes"),
	ZAF("ZA", 710, "AFS", "SF", "RSA", "RSA", "ZA", "ZA", "227", "sa", "27", "South Africa", "Yes"),
	ZMB("ZM", 894, "ZMB", "ZA", "ZAM", "ZAM", "Z", "ZB", "270", "za", "260", "Zambia", "Yes"),
	ZWE("ZW", 716, "ZWE", "ZI", "ZIM", "ZIM", "ZW", "ZW", "271", "rh", "263", "Zimbabwe", "Yes"),
	
	UNKNOWN("",  0,    "",   "",    "",    "",   "",  "",     "",   "",    "",         "", "");

    private final String isoA2;
    private final int isoNum;
    private final String itu;
    private final String fips;
    private final String ioc;
    private final String fifa;
    private final String ds;
    private final String wmo;
    private final String gaul;
    private final String marc;
    private final String dial;
    private final String countryName;
    private final String independent;
    
    private static final Map<String, CountryInfo> isoAlpha2Map = new HashMap<>();
    private static final Map<Integer, CountryInfo> isoNumMap = new HashMap<>();


    static
    {
        for (CountryInfo ci : values())
        {
        	isoAlpha2Map.put(ci.getISOa2(), ci);
            isoNumMap.put(ci.getISONum(), ci);
        }
        
        isoAlpha2Map.remove(UNKNOWN);
        isoNumMap.remove(UNKNOWN);
    }
    
    private CountryInfo
    (
		String isoA2,
		int isoNum,
		String itu,
		String fips,
		String ioc,
		String fifa,
		String ds,
		String wmo,
		String gaul,
		String marc,
		String dial,
		String countryName,
		String independent
    )
    {
        this.isoA2 = isoA2;
        this.isoNum = isoNum;
        this.itu = itu;
        this.fips = fips;
        this.ioc = ioc;
        this.fifa = fifa;
        this.ds = ds;
        this.wmo = wmo;
        this.gaul = gaul;
        this.marc = marc;
        this.dial = dial;
        this.countryName = countryName;
        this.independent = independent;        
    }

    /**
     * Get a CountryInfo that corresponds to the given ISO 3166-1
     * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">alpha-2</a> or
     * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-3">alpha-3</a> code.
     *
     * @param isoCode
     *         An ISO 3166-1 <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2"
     *         >alpha-2</a> or <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-3"
     *         >alpha-3</a> code.
     *
     * @return
     *         A CountryInfo instance, or CountryInfo.UNKNOWN if not found.
     */
    public static CountryInfo forISO(String code)
    {
        if (code != null)
        {
        	code = code.toUpperCase();
        	
            switch (code.length())
            {
                case 2:		return forISOa2(code);
                case 3:		return forISOa3(code);
            }
        }
        
		return CountryInfo.UNKNOWN;
    }

    private static CountryInfo forISOa3(String code)
    {
        try
        {
            return Enum.valueOf(CountryInfo.class, code);
        }
        catch (IllegalArgumentException e)
        {
            return CountryInfo.UNKNOWN;
        }
    }


    private static CountryInfo forISOa2(String code)
    {
        CountryInfo cc = isoAlpha2Map.get(code);
        if (null == cc) { cc = CountryInfo.UNKNOWN; }
        
        return cc;
    }


    /**
     * Get a CountryInfo that corresponds to the given
     * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_numeric">ISO 3166-1
     * numeric</a> code.
     *
     * @param code
     *         An <a href="http://en.wikipedia.org/wiki/ISO_3166-1_numeric"
     *         >ISO 3166-1 numeric</a> code.
     *
     * @return
     *         A CountryInfo instance, or CountryInfo.UNKNOWN if not found.
     */
    public static CountryInfo forISO(int code)
    {
        CountryInfo cc = isoNumMap.get(code);
        if (null == cc) { cc = CountryInfo.UNKNOWN; }
        
        return cc;
    }
    
    public final String getISOa3()  { return this.name(); }
	public final String getISOa2()  { return isoA2; }
	public final int	getISONum() { return isoNum; }
	public final String getITU()    { return itu; }
	public final String getFIPS()   { return fips; }
	public final String getIOC()    { return ioc; }
	public final String getFIFA()   { return fifa; }
	public final String getDS()     { return ds; }
	public final String getWMO()    { return wmo; }
	public final String getGAUL()   { return gaul; }
	public final String getMARC()   { return marc; }
	public final String getDial()   { return dial; }
	public final String getCountryName() { return countryName; }
	public final String getIndependent() { return independent; }
	
	
	
	// usage example
//	public static void main(String[] args) {
//		
//		CountryInfo ci;
//		
//		ci = CountryInfo.forISO("FRA");
//		System.out.println( ci.getISOa3() );
//		System.out.println( ci.getISOa2() );
//		System.out.println( ci.getCountryName() );
//
//		ci = CountryInfo.forISO("ABC");
//		System.out.println( ci.getISOa3() );
//		System.out.println( ci.getISOa2() );
//		System.out.println( ci.getCountryName() );
//
//		ci = CountryInfo.forISO(392);
//		System.out.println( ci.getISOa3() );
//		System.out.println( ci.getISOa2() );
//		System.out.println( ci.getCountryName() );
//
//	}
}
