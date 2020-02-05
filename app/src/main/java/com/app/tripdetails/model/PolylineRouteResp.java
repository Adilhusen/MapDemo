package com.app.tripdetails.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PolylineRouteResp {

    /**
     * geocoded_waypoints : [{"geocoder_status":"OK","partial_match":true,"place_id":"ChIJSdRbuoqEXjkRFmVPYRHdzk8","types":["locality","political"]},{"geocoder_status":"OK","place_id":"ChIJCWhtfJgrXDkRkQM-h6cGb_g","types":["locality","political"]}]
     * routes : [{"bounds":{"northeast":{"lat":23.2158147,"lng":72.6427351},"southwest":{"lat":23.022503,"lng":72.5711003}},"copyrights":"Map data ©2020","legs":[{"distance":{"text":"26.7 km","value":26672},"duration":{"text":"40 mins","value":2399},"end_address":"Gandhinagar, Gujarat, India","end_location":{"lat":23.2154995,"lng":72.6368078},"start_address":"Ahmedabad, Gujarat, India","start_location":{"lat":23.022503,"lng":72.5712842},"steps":[{"distance":{"text":"0.5 km","value":458},"duration":{"text":"1 min","value":87},"end_location":{"lat":23.0266199,"lng":72.5711072},"html_instructions":"Head <b>north<\/b> on <b>Ashram Rd<\/b> toward <b>Sheth Mangaldas Rd<\/b>/<wbr/><b>Swami Vivekananda Rd<\/b><div style=\"font-size:0.9em\">Pass by Sheth Mangaldas Girdhardas Memorial Hall (on the left)<\/div>","polyline":{"points":"sqokCoa}yLK?}ADK?s@@a@?{@A_CA_@@eBBU@e@B_@@_BFS?yAF"},"start_location":{"lat":23.022503,"lng":72.5712842},"travel_mode":"DRIVING"},{"distance":{"text":"0.6 km","value":628},"duration":{"text":"1 min","value":88},"end_location":{"lat":23.0271575,"lng":72.5771157},"html_instructions":"Turn <b>right<\/b> onto <b>Nehru Bridge<\/b>","maneuver":"turn-right","polyline":{"points":"kkpkCm`}yLQ@AYBi@SuEc@mMc@kM"},"start_location":{"lat":23.0266199,"lng":72.5711072},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":99},"duration":{"text":"1 min","value":12},"end_location":{"lat":23.0272311,"lng":72.57808469999999},"html_instructions":"Continue onto <b>Rustom Cama Marg<\/b>","polyline":{"points":"wnpkC_f~yLM_E"},"start_location":{"lat":23.0271575,"lng":72.5771157},"travel_mode":"DRIVING"},{"distance":{"text":"0.6 km","value":559},"duration":{"text":"2 mins","value":97},"end_location":{"lat":23.0317823,"lng":72.5770314},"html_instructions":"Turn <b>left<\/b> onto <b>Khanpur Rd<\/b>","maneuver":"turn-left","polyline":{"points":"eopkC_l~yLUSGEICIEOCM?[AmABG?I@KHMJKNU`@GHIHe@Ze@Z[TKHIJWZIFKDG@mBIG?s@@U@e@?gABM?o@@E?mAH"},"start_location":{"lat":23.0272311,"lng":72.57808469999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":103},"duration":{"text":"1 min","value":21},"end_location":{"lat":23.0317451,"lng":72.5760241},"html_instructions":"Turn <b>left<\/b> toward <b>Riverfront Rd<\/b>","maneuver":"turn-left","polyline":{"points":"skqkCme~yLDhE"},"start_location":{"lat":23.0317823,"lng":72.5770314},"travel_mode":"DRIVING"},{"distance":{"text":"4.9 km","value":4861},"duration":{"text":"7 mins","value":398},"end_location":{"lat":23.0630202,"lng":72.597034},"html_instructions":"Turn <b>right<\/b> after Cama Hotel (on the right)","maneuver":"turn-right","polyline":{"points":"mkqkCc_~yL@PsIPe@D{AH_CP{BVwAR{@RwAZ_AR}@NaAJaAFeAA}@C}AAgACC?gBGa@CiCKEAyFa@gIcAOAu@Mq@Iq@Gs@Im@Gw@KgAQu@KwAS{@Mo@Iy@MaAMg@Ia@ImASs@OcAQg@Mc@Km@Qm@QoA]w@W[MWKWOYUQQWYOUOSKQOQQUOOgAu@o@]iB_A]Q_@QgAi@o@[mAq@eEaDaBuAc@e@a@a@gBqBaBsBw@cAoBgCoBkCuAgBKKmCyBa@WWWOMKSSi@ISMYCGc@cAs@aB{A}DIQIOKMKIMMSQIIGIEIEKM[EKCMEQEa@ASEUGYISUk@Ws@M]Ka@GUGW[wAOe@e@sBYiAe@iBq@oBgAgCgAwBs@aBa@}@M[CG?GAG?I?E?EBEDGRKtAs@nCuATGNA"},"start_location":{"lat":23.0317451,"lng":72.5760241},"travel_mode":"DRIVING"},{"distance":{"text":"3.0 km","value":2961},"duration":{"text":"4 mins","value":266},"end_location":{"lat":23.0815653,"lng":72.6161645},"html_instructions":"Turn <b>left<\/b> onto <b>Airport Rd<\/b>","maneuver":"turn-left","polyline":{"points":"{nwkCmbbzLa@eBGMc@wAMc@m@kBCGIWIQEKEGGGQM[UAAi@U{BmA[Qs@_@UMSKu@Sy@Ki@Ie@Ge@KYIe@Q{@_@uDqBy@c@mB_A}As@A?aAg@{Aw@gAk@kAm@UMQO[[KI]]SQaAeA[]w@s@a@_@yAyAk@m@u@u@OOKKUSA?mA_AUQm@e@k@c@YQQOoEaDwAeA{@o@wAaAaEoCc@]IGUWGMO]a@mAeByFwAuEg@}A{BgHw@sBGW]cAg@}AMUMOQO"},"start_location":{"lat":23.0630202,"lng":72.597034},"travel_mode":"DRIVING"},{"distance":{"text":"1.6 km","value":1612},"duration":{"text":"3 mins","value":160},"end_location":{"lat":23.0859893,"lng":72.6298894},"html_instructions":"At <b>Airport Cir<\/b>, take the <b>2nd<\/b> exit and stay on <b>Airport Rd<\/b><div style=\"font-size:0.9em\">Pass by ISCON Villa (on the left in 1.2&nbsp;km)<\/div>","maneuver":"roundabout-left","polyline":{"points":"yb{kC_zezLA?A?AAA?C?AAC?AACAAACAAAAAACAAAC?CAA?CAC?A@GM]_@w@_@i@_@k@UYIOO[CMKm@KsAE{@Ek@UuCEUEUMUMUIMIOCAi@YGCo@YUGaA[A?}@UOEIC]OQK]Yc@g@WYS]ISGQEMCOGm@QmICsAE}ACwAAo@G{CEmA?c@Ag@Ce@Aa@?C?MEyB?g@GoFA_@ASAOK]"},"start_location":{"lat":23.0815653,"lng":72.6161645},"travel_mode":"DRIVING"},{"distance":{"text":"3.4 km","value":3416},"duration":{"text":"4 mins","value":258},"end_location":{"lat":23.116613,"lng":72.63104419999999},"html_instructions":"At <b>Apollo Cir<\/b>, take the <b>1st<\/b> exit onto <b>Gandhinagar - Ahmedabad Rd<\/b><div style=\"font-size:0.9em\">Pass by Kanoria Hospital and Research Centre (on the left in 1.5&nbsp;km)<\/div>","maneuver":"roundabout-left","polyline":{"points":"m~{kCyohzLA?AAAAAAA?AAAA?AgACyA?y@?iA@o@?aCByA@iRN_@?u@?w@?sBB_@@{EBkB@gJBO@cDFs@Ae@@g@?y@@_@?sC@A?uC@gAAmCCmBGs@CqBI}Jc@a@EMAOAK?i@A_ESm]_BKA_I[{COkI_@mCOw@CE?G@G@UDa@H"},"start_location":{"lat":23.0859893,"lng":72.6298894},"travel_mode":"DRIVING"},{"distance":{"text":"1.9 km","value":1891},"duration":{"text":"2 mins","value":137},"end_location":{"lat":23.1334629,"lng":72.63280069999999},"html_instructions":"At <b>Bhat Cir<\/b>, take the <b>4th<\/b> exit and stay on <b>Gandhinagar - Ahmedabad Rd<\/b><div style=\"font-size:0.9em\">Pass by Manvar Party Plot (on the left in 1.6&nbsp;km)<\/div>","maneuver":"roundabout-left","polyline":{"points":"y}alC_whzLA@GBC?A@C?CBE?G@G?GAGAGCECGGAAAAAC?AAA?AAA?As@KSEMAOAUA{AIkFWiDQiAGK?m@Cm@EoKg@eI]I?_FWeBImBIgBIqBKcBIsDO}COy@EqAGcCMIAsGY}@?[?"},"start_location":{"lat":23.116613,"lng":72.63104419999999},"travel_mode":"DRIVING"},{"distance":{"text":"3.7 km","value":3744},"duration":{"text":"4 mins","value":257},"end_location":{"lat":23.1668074,"lng":72.6363606},"html_instructions":"At <b>Koba Cir<\/b>, take the <b>3rd<\/b> exit and stay on <b>Gandhinagar - Ahmedabad Rd<\/b>","maneuver":"roundabout-left","polyline":{"points":"cgelC_bizLA@?@?@A@?@A??@A@CBABC@CBC@CBC@E@A?C@C?A@C?C?A?C?C?CAEACACACCCAACCAACAAACACACAAAC{@S]Ce@CaDQkDOcIc@oa@qBsAEoJc@aDS_CKiMq@gI_@uOw@oKi@sF[kG[_CMqCOmCMcH_@{Ls@_H_@yF["},"start_location":{"lat":23.1334629,"lng":72.63280069999999},"travel_mode":"DRIVING"},{"distance":{"text":"2.1 km","value":2101},"duration":{"text":"3 mins","value":150},"end_location":{"lat":23.1856047,"lng":72.6383917},"html_instructions":"Continue straight past Krishna Clothes Iron Shop to stay on <b>Gandhinagar - Ahmedabad Rd<\/b><div style=\"font-size:0.9em\">Pass by Swaminarayandhamgatekudasan (on the right in 1.3&nbsp;km)<\/div>","maneuver":"straight","polyline":{"points":"qwklCgxizLkEUqMs@qDS}DQa@Cc@Ca@Ca@Cc@Ca@Cc@Ca@Ca@Cc@Ca@Ca@Cc@Ca@C_@C{X{AqDUkCOmBKmEUmCMqNw@cB?"},"start_location":{"lat":23.1668074,"lng":72.6363606},"travel_mode":"DRIVING"},{"distance":{"text":"1.1 km","value":1131},"duration":{"text":"2 mins","value":95},"end_location":{"lat":23.1956698,"lng":72.6393018},"html_instructions":"At <b>Raksha Shakti Cir<\/b>, take the <b>2nd<\/b> exit and stay on <b>Gandhinagar - Ahmedabad Rd<\/b><div style=\"font-size:0.9em\">Pass by Raksha Shakti Circle (Dholakuva Circle) (on the right)<\/div>","maneuver":"roundabout-left","polyline":{"points":"_molC}djzLA??@A??@C@C?C@C?C?C?CAC?GCAAA??AA??AA??Aa@CMCWEGAsF]uG_@iEWg@CeKi@mKk@cBI_AA}@C[B_@DMFKDQF"},"start_location":{"lat":23.1856047,"lng":72.6383917},"travel_mode":"DRIVING"},{"distance":{"text":"1.1 km","value":1055},"duration":{"text":"1 min","value":89},"end_location":{"lat":23.2044089,"lng":72.6427351},"html_instructions":"At <b>Indroda Cir<\/b>, take the <b>2nd<\/b> exit onto <b>CH Rd<\/b><div style=\"font-size:0.9em\">Pass by Vaghela Photography (on the left in 600&nbsp;m)<\/div>","maneuver":"roundabout-left","polyline":{"points":"}kqlCsjjzLEDGBEBGBOBG?I?I?ICGCICGECACCACCCACCCAEACa@UKEME[I}Ea@mAO_AMcASiCg@kCm@eBe@cBk@aA]wAk@oJgF_Ae@]S"},"start_location":{"lat":23.1956698,"lng":72.6393018},"travel_mode":"DRIVING"},{"distance":{"text":"0.8 km","value":798},"duration":{"text":"1 min","value":82},"end_location":{"lat":23.20808,"lng":72.6360558},"html_instructions":"At <b>Nyay Circle- CH -2<\/b>, take the <b>1st<\/b> exit onto <b>Rd Number 2<\/b><div style=\"font-size:0.9em\">Pass by P.K. Tea Stall (on the right)<\/div>","maneuver":"roundabout-left","polyline":{"points":"qbslCc`kzLA@A?A??@A?A?A?A?KNGHg@jAsAxCo@xAm@xAi@lAu@`Bi@nAa@|@CHyC|GgA`Ck@pAc@dA"},"start_location":{"lat":23.2044089,"lng":72.6427351},"travel_mode":"DRIVING"},{"distance":{"text":"0.4 km","value":419},"duration":{"text":"1 min","value":45},"end_location":{"lat":23.2099177,"lng":72.6326448},"html_instructions":"At <b>GH 2 Hemchandra Charya Cir<\/b>, take the <b>2nd<\/b> exit and stay on <b>Rd Number 2<\/b><div style=\"font-size:0.9em\">Pass by S.B.Insurance (on the right)<\/div>","maneuver":"roundabout-left","polyline":{"points":"oyslCkvizLDDBF@D@F?FAHAFCFEDCBEDG@K?k@v@iExJ{AhD"},"start_location":{"lat":23.20808,"lng":72.6360558},"travel_mode":"DRIVING"},{"distance":{"text":"0.8 km","value":766},"duration":{"text":"2 mins","value":138},"end_location":{"lat":23.2158147,"lng":72.6362141},"html_instructions":"Turn <b>right<\/b><div style=\"font-size:0.9em\">Pass by GH 2 Bus Stop (on the left)<\/div>","maneuver":"turn-right","polyline":{"points":"_etlC_aizLIPMIoFyCkAo@CAECKCKCMCm@IKCUCOGcAi@]QIG]Qc@Q]SSMWOk@][S_@[s@s@mA_A_Ag@qAs@MKSKSGKC"},"start_location":{"lat":23.2099177,"lng":72.6326448},"travel_mode":"DRIVING"},{"distance":{"text":"70 m","value":70},"duration":{"text":"1 min","value":19},"end_location":{"lat":23.2154995,"lng":72.6368078},"html_instructions":"Turn <b>right<\/b>","maneuver":"turn-right","polyline":{"points":"yiulCiwizL|@wB"},"start_location":{"lat":23.2158147,"lng":72.6362141},"travel_mode":"DRIVING"}],"traffic_speed_entry":[],"via_waypoint":[]}],"overview_polyline":{"points":"sqokCoa}yLiDF}AA_D?aEJ_FP@cAw@cTq@kS]YSI]CiB@Q@YTa@p@QRkAv@g@^a@f@ULuBGwBBkCDmAHDhE@PsIPaCN{Fh@sCf@wCn@_CZaAFeAA{CEkACyGYyFa@gIcAeAOeEc@uNqBkEw@kB_@qA]}Bo@sAe@o@[k@g@g@o@[e@a@g@wAeAwEaCwBeAmAq@eEaDeC{BiCsCyCwD_FsGaBsBoDqCg@e@_@}@_AyBs@aB{A}DSa@y@w@]i@Sg@I_@Gu@Mo@eAqCw@gDuBmIq@oBgAgC{ByEo@yACOA]HMhB_AnCuATGNAa@eBk@eB{@oC]}@MOm@c@cEwBiAm@iA_@cBUkAS_A[{@_@uDqBgDcB_Bs@qHyDg@]g@e@q@o@}AcB_F{EgBeBsCwBgHgFsCuByGqEm@e@]e@q@kB}DoMcDeK_AkCeAaD[e@SOEAUIKWAEKe@_@w@_@i@u@eAYk@O{@m@qIKk@[k@S]m@[w@]wAc@yA_@o@[aAaAk@w@Qe@I]Gm@_@wQWqLM_LCs@Mm@GEEEaDCcC@uZTuA?kDBoUJsDHyA?uGBwC@uEEaDKoNm@kAIce@wB{Mk@yMo@}@COBw@NIDMD]?OEMKEGCGuAUmJe@mH]mWkAca@kByG]sGY}@?]@AFGFMJOFMBM?QGMKGMCE}@WcAGmIa@sk@uCcMi@s`@qBel@yCcUkAad@eCcSgA_FUkCOuG_@es@yDqNw@cB?A?A@GBO@UIc@Ge@I{F_@m[eBqNu@}BE{@HYLe@TWFQ?e@KQOKQc@YYK[I}Ea@mC]mE{@qFsAeDiAwAk@oJgF}Ay@C@E@WXyExK}LxXc@dADDDL@NCPILIHS@k@v@iExJeBzD}FcDaBy@sAUe@KaB{@iB_AsBoAsAoAmA_A_Ag@_B_Ag@SKC|@wB"},"summary":"Gandhinagar - Ahmedabad Rd","warnings":[],"waypoint_order":[]}]
     * status : OK
     */

    @SerializedName("status")
    private String status;
    @SerializedName("geocoded_waypoints")
    private List<GeocodedWaypointsBean> geocodedWaypoints;
    @SerializedName("routes")
    private List<RoutesBean> routes;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<GeocodedWaypointsBean> getGeocodedWaypoints() {
        return geocodedWaypoints;
    }

    public void setGeocodedWaypoints(List<GeocodedWaypointsBean> geocodedWaypoints) {
        this.geocodedWaypoints = geocodedWaypoints;
    }

    public List<RoutesBean> getRoutes() {
        return routes;
    }

    public void setRoutes(List<RoutesBean> routes) {
        this.routes = routes;
    }

    public static class GeocodedWaypointsBean {
        /**
         * geocoder_status : OK
         * partial_match : true
         * place_id : ChIJSdRbuoqEXjkRFmVPYRHdzk8
         * types : ["locality","political"]
         */

        @SerializedName("geocoder_status")
        private String geocoderStatus;
        @SerializedName("partial_match")
        private boolean partialMatch;
        @SerializedName("place_id")
        private String placeId;
        @SerializedName("types")
        private List<String> types;

        public String getGeocoderStatus() {
            return geocoderStatus;
        }

        public void setGeocoderStatus(String geocoderStatus) {
            this.geocoderStatus = geocoderStatus;
        }

        public boolean isPartialMatch() {
            return partialMatch;
        }

        public void setPartialMatch(boolean partialMatch) {
            this.partialMatch = partialMatch;
        }

        public String getPlaceId() {
            return placeId;
        }

        public void setPlaceId(String placeId) {
            this.placeId = placeId;
        }

        public List<String> getTypes() {
            return types;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }
    }

    public static class RoutesBean {
        /**
         * bounds : {"northeast":{"lat":23.2158147,"lng":72.6427351},"southwest":{"lat":23.022503,"lng":72.5711003}}
         * copyrights : Map data ©2020
         * legs : [{"distance":{"text":"26.7 km","value":26672},"duration":{"text":"40 mins","value":2399},"end_address":"Gandhinagar, Gujarat, India","end_location":{"lat":23.2154995,"lng":72.6368078},"start_address":"Ahmedabad, Gujarat, India","start_location":{"lat":23.022503,"lng":72.5712842},"steps":[{"distance":{"text":"0.5 km","value":458},"duration":{"text":"1 min","value":87},"end_location":{"lat":23.0266199,"lng":72.5711072},"html_instructions":"Head <b>north<\/b> on <b>Ashram Rd<\/b> toward <b>Sheth Mangaldas Rd<\/b>/<wbr/><b>Swami Vivekananda Rd<\/b><div style=\"font-size:0.9em\">Pass by Sheth Mangaldas Girdhardas Memorial Hall (on the left)<\/div>","polyline":{"points":"sqokCoa}yLK?}ADK?s@@a@?{@A_CA_@@eBBU@e@B_@@_BFS?yAF"},"start_location":{"lat":23.022503,"lng":72.5712842},"travel_mode":"DRIVING"},{"distance":{"text":"0.6 km","value":628},"duration":{"text":"1 min","value":88},"end_location":{"lat":23.0271575,"lng":72.5771157},"html_instructions":"Turn <b>right<\/b> onto <b>Nehru Bridge<\/b>","maneuver":"turn-right","polyline":{"points":"kkpkCm`}yLQ@AYBi@SuEc@mMc@kM"},"start_location":{"lat":23.0266199,"lng":72.5711072},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":99},"duration":{"text":"1 min","value":12},"end_location":{"lat":23.0272311,"lng":72.57808469999999},"html_instructions":"Continue onto <b>Rustom Cama Marg<\/b>","polyline":{"points":"wnpkC_f~yLM_E"},"start_location":{"lat":23.0271575,"lng":72.5771157},"travel_mode":"DRIVING"},{"distance":{"text":"0.6 km","value":559},"duration":{"text":"2 mins","value":97},"end_location":{"lat":23.0317823,"lng":72.5770314},"html_instructions":"Turn <b>left<\/b> onto <b>Khanpur Rd<\/b>","maneuver":"turn-left","polyline":{"points":"eopkC_l~yLUSGEICIEOCM?[AmABG?I@KHMJKNU`@GHIHe@Ze@Z[TKHIJWZIFKDG@mBIG?s@@U@e@?gABM?o@@E?mAH"},"start_location":{"lat":23.0272311,"lng":72.57808469999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":103},"duration":{"text":"1 min","value":21},"end_location":{"lat":23.0317451,"lng":72.5760241},"html_instructions":"Turn <b>left<\/b> toward <b>Riverfront Rd<\/b>","maneuver":"turn-left","polyline":{"points":"skqkCme~yLDhE"},"start_location":{"lat":23.0317823,"lng":72.5770314},"travel_mode":"DRIVING"},{"distance":{"text":"4.9 km","value":4861},"duration":{"text":"7 mins","value":398},"end_location":{"lat":23.0630202,"lng":72.597034},"html_instructions":"Turn <b>right<\/b> after Cama Hotel (on the right)","maneuver":"turn-right","polyline":{"points":"mkqkCc_~yL@PsIPe@D{AH_CP{BVwAR{@RwAZ_AR}@NaAJaAFeAA}@C}AAgACC?gBGa@CiCKEAyFa@gIcAOAu@Mq@Iq@Gs@Im@Gw@KgAQu@KwAS{@Mo@Iy@MaAMg@Ia@ImASs@OcAQg@Mc@Km@Qm@QoA]w@W[MWKWOYUQQWYOUOSKQOQQUOOgAu@o@]iB_A]Q_@QgAi@o@[mAq@eEaDaBuAc@e@a@a@gBqBaBsBw@cAoBgCoBkCuAgBKKmCyBa@WWWOMKSSi@ISMYCGc@cAs@aB{A}DIQIOKMKIMMSQIIGIEIEKM[EKCMEQEa@ASEUGYISUk@Ws@M]Ka@GUGW[wAOe@e@sBYiAe@iBq@oBgAgCgAwBs@aBa@}@M[CG?GAG?I?E?EBEDGRKtAs@nCuATGNA"},"start_location":{"lat":23.0317451,"lng":72.5760241},"travel_mode":"DRIVING"},{"distance":{"text":"3.0 km","value":2961},"duration":{"text":"4 mins","value":266},"end_location":{"lat":23.0815653,"lng":72.6161645},"html_instructions":"Turn <b>left<\/b> onto <b>Airport Rd<\/b>","maneuver":"turn-left","polyline":{"points":"{nwkCmbbzLa@eBGMc@wAMc@m@kBCGIWIQEKEGGGQM[UAAi@U{BmA[Qs@_@UMSKu@Sy@Ki@Ie@Ge@KYIe@Q{@_@uDqBy@c@mB_A}As@A?aAg@{Aw@gAk@kAm@UMQO[[KI]]SQaAeA[]w@s@a@_@yAyAk@m@u@u@OOKKUSA?mA_AUQm@e@k@c@YQQOoEaDwAeA{@o@wAaAaEoCc@]IGUWGMO]a@mAeByFwAuEg@}A{BgHw@sBGW]cAg@}AMUMOQO"},"start_location":{"lat":23.0630202,"lng":72.597034},"travel_mode":"DRIVING"},{"distance":{"text":"1.6 km","value":1612},"duration":{"text":"3 mins","value":160},"end_location":{"lat":23.0859893,"lng":72.6298894},"html_instructions":"At <b>Airport Cir<\/b>, take the <b>2nd<\/b> exit and stay on <b>Airport Rd<\/b><div style=\"font-size:0.9em\">Pass by ISCON Villa (on the left in 1.2&nbsp;km)<\/div>","maneuver":"roundabout-left","polyline":{"points":"yb{kC_zezLA?A?AAA?C?AAC?AACAAACAAAAAACAAAC?CAA?CAC?A@GM]_@w@_@i@_@k@UYIOO[CMKm@KsAE{@Ek@UuCEUEUMUMUIMIOCAi@YGCo@YUGaA[A?}@UOEIC]OQK]Yc@g@WYS]ISGQEMCOGm@QmICsAE}ACwAAo@G{CEmA?c@Ag@Ce@Aa@?C?MEyB?g@GoFA_@ASAOK]"},"start_location":{"lat":23.0815653,"lng":72.6161645},"travel_mode":"DRIVING"},{"distance":{"text":"3.4 km","value":3416},"duration":{"text":"4 mins","value":258},"end_location":{"lat":23.116613,"lng":72.63104419999999},"html_instructions":"At <b>Apollo Cir<\/b>, take the <b>1st<\/b> exit onto <b>Gandhinagar - Ahmedabad Rd<\/b><div style=\"font-size:0.9em\">Pass by Kanoria Hospital and Research Centre (on the left in 1.5&nbsp;km)<\/div>","maneuver":"roundabout-left","polyline":{"points":"m~{kCyohzLA?AAAAAAA?AAAA?AgACyA?y@?iA@o@?aCByA@iRN_@?u@?w@?sBB_@@{EBkB@gJBO@cDFs@Ae@@g@?y@@_@?sC@A?uC@gAAmCCmBGs@CqBI}Jc@a@EMAOAK?i@A_ESm]_BKA_I[{COkI_@mCOw@CE?G@G@UDa@H"},"start_location":{"lat":23.0859893,"lng":72.6298894},"travel_mode":"DRIVING"},{"distance":{"text":"1.9 km","value":1891},"duration":{"text":"2 mins","value":137},"end_location":{"lat":23.1334629,"lng":72.63280069999999},"html_instructions":"At <b>Bhat Cir<\/b>, take the <b>4th<\/b> exit and stay on <b>Gandhinagar - Ahmedabad Rd<\/b><div style=\"font-size:0.9em\">Pass by Manvar Party Plot (on the left in 1.6&nbsp;km)<\/div>","maneuver":"roundabout-left","polyline":{"points":"y}alC_whzLA@GBC?A@C?CBE?G@G?GAGAGCECGGAAAAAC?AAA?AAA?As@KSEMAOAUA{AIkFWiDQiAGK?m@Cm@EoKg@eI]I?_FWeBImBIgBIqBKcBIsDO}COy@EqAGcCMIAsGY}@?[?"},"start_location":{"lat":23.116613,"lng":72.63104419999999},"travel_mode":"DRIVING"},{"distance":{"text":"3.7 km","value":3744},"duration":{"text":"4 mins","value":257},"end_location":{"lat":23.1668074,"lng":72.6363606},"html_instructions":"At <b>Koba Cir<\/b>, take the <b>3rd<\/b> exit and stay on <b>Gandhinagar - Ahmedabad Rd<\/b>","maneuver":"roundabout-left","polyline":{"points":"cgelC_bizLA@?@?@A@?@A??@A@CBABC@CBC@CBC@E@A?C@C?A@C?C?A?C?C?CAEACACACCCAACCAACAAACACACAAAC{@S]Ce@CaDQkDOcIc@oa@qBsAEoJc@aDS_CKiMq@gI_@uOw@oKi@sF[kG[_CMqCOmCMcH_@{Ls@_H_@yF["},"start_location":{"lat":23.1334629,"lng":72.63280069999999},"travel_mode":"DRIVING"},{"distance":{"text":"2.1 km","value":2101},"duration":{"text":"3 mins","value":150},"end_location":{"lat":23.1856047,"lng":72.6383917},"html_instructions":"Continue straight past Krishna Clothes Iron Shop to stay on <b>Gandhinagar - Ahmedabad Rd<\/b><div style=\"font-size:0.9em\">Pass by Swaminarayandhamgatekudasan (on the right in 1.3&nbsp;km)<\/div>","maneuver":"straight","polyline":{"points":"qwklCgxizLkEUqMs@qDS}DQa@Cc@Ca@Ca@Cc@Ca@Cc@Ca@Ca@Cc@Ca@Ca@Cc@Ca@C_@C{X{AqDUkCOmBKmEUmCMqNw@cB?"},"start_location":{"lat":23.1668074,"lng":72.6363606},"travel_mode":"DRIVING"},{"distance":{"text":"1.1 km","value":1131},"duration":{"text":"2 mins","value":95},"end_location":{"lat":23.1956698,"lng":72.6393018},"html_instructions":"At <b>Raksha Shakti Cir<\/b>, take the <b>2nd<\/b> exit and stay on <b>Gandhinagar - Ahmedabad Rd<\/b><div style=\"font-size:0.9em\">Pass by Raksha Shakti Circle (Dholakuva Circle) (on the right)<\/div>","maneuver":"roundabout-left","polyline":{"points":"_molC}djzLA??@A??@C@C?C@C?C?C?CAC?GCAAA??AA??AA??Aa@CMCWEGAsF]uG_@iEWg@CeKi@mKk@cBI_AA}@C[B_@DMFKDQF"},"start_location":{"lat":23.1856047,"lng":72.6383917},"travel_mode":"DRIVING"},{"distance":{"text":"1.1 km","value":1055},"duration":{"text":"1 min","value":89},"end_location":{"lat":23.2044089,"lng":72.6427351},"html_instructions":"At <b>Indroda Cir<\/b>, take the <b>2nd<\/b> exit onto <b>CH Rd<\/b><div style=\"font-size:0.9em\">Pass by Vaghela Photography (on the left in 600&nbsp;m)<\/div>","maneuver":"roundabout-left","polyline":{"points":"}kqlCsjjzLEDGBEBGBOBG?I?I?ICGCICGECACCACCCACCCAEACa@UKEME[I}Ea@mAO_AMcASiCg@kCm@eBe@cBk@aA]wAk@oJgF_Ae@]S"},"start_location":{"lat":23.1956698,"lng":72.6393018},"travel_mode":"DRIVING"},{"distance":{"text":"0.8 km","value":798},"duration":{"text":"1 min","value":82},"end_location":{"lat":23.20808,"lng":72.6360558},"html_instructions":"At <b>Nyay Circle- CH -2<\/b>, take the <b>1st<\/b> exit onto <b>Rd Number 2<\/b><div style=\"font-size:0.9em\">Pass by P.K. Tea Stall (on the right)<\/div>","maneuver":"roundabout-left","polyline":{"points":"qbslCc`kzLA@A?A??@A?A?A?A?KNGHg@jAsAxCo@xAm@xAi@lAu@`Bi@nAa@|@CHyC|GgA`Ck@pAc@dA"},"start_location":{"lat":23.2044089,"lng":72.6427351},"travel_mode":"DRIVING"},{"distance":{"text":"0.4 km","value":419},"duration":{"text":"1 min","value":45},"end_location":{"lat":23.2099177,"lng":72.6326448},"html_instructions":"At <b>GH 2 Hemchandra Charya Cir<\/b>, take the <b>2nd<\/b> exit and stay on <b>Rd Number 2<\/b><div style=\"font-size:0.9em\">Pass by S.B.Insurance (on the right)<\/div>","maneuver":"roundabout-left","polyline":{"points":"oyslCkvizLDDBF@D@F?FAHAFCFEDCBEDG@K?k@v@iExJ{AhD"},"start_location":{"lat":23.20808,"lng":72.6360558},"travel_mode":"DRIVING"},{"distance":{"text":"0.8 km","value":766},"duration":{"text":"2 mins","value":138},"end_location":{"lat":23.2158147,"lng":72.6362141},"html_instructions":"Turn <b>right<\/b><div style=\"font-size:0.9em\">Pass by GH 2 Bus Stop (on the left)<\/div>","maneuver":"turn-right","polyline":{"points":"_etlC_aizLIPMIoFyCkAo@CAECKCKCMCm@IKCUCOGcAi@]QIG]Qc@Q]SSMWOk@][S_@[s@s@mA_A_Ag@qAs@MKSKSGKC"},"start_location":{"lat":23.2099177,"lng":72.6326448},"travel_mode":"DRIVING"},{"distance":{"text":"70 m","value":70},"duration":{"text":"1 min","value":19},"end_location":{"lat":23.2154995,"lng":72.6368078},"html_instructions":"Turn <b>right<\/b>","maneuver":"turn-right","polyline":{"points":"yiulCiwizL|@wB"},"start_location":{"lat":23.2158147,"lng":72.6362141},"travel_mode":"DRIVING"}],"traffic_speed_entry":[],"via_waypoint":[]}]
         * overview_polyline : {"points":"sqokCoa}yLiDF}AA_D?aEJ_FP@cAw@cTq@kS]YSI]CiB@Q@YTa@p@QRkAv@g@^a@f@ULuBGwBBkCDmAHDhE@PsIPaCN{Fh@sCf@wCn@_CZaAFeAA{CEkACyGYyFa@gIcAeAOeEc@uNqBkEw@kB_@qA]}Bo@sAe@o@[k@g@g@o@[e@a@g@wAeAwEaCwBeAmAq@eEaDeC{BiCsCyCwD_FsGaBsBoDqCg@e@_@}@_AyBs@aB{A}DSa@y@w@]i@Sg@I_@Gu@Mo@eAqCw@gDuBmIq@oBgAgC{ByEo@yACOA]HMhB_AnCuATGNAa@eBk@eB{@oC]}@MOm@c@cEwBiAm@iA_@cBUkAS_A[{@_@uDqBgDcB_Bs@qHyDg@]g@e@q@o@}AcB_F{EgBeBsCwBgHgFsCuByGqEm@e@]e@q@kB}DoMcDeK_AkCeAaD[e@SOEAUIKWAEKe@_@w@_@i@u@eAYk@O{@m@qIKk@[k@S]m@[w@]wAc@yA_@o@[aAaAk@w@Qe@I]Gm@_@wQWqLM_LCs@Mm@GEEEaDCcC@uZTuA?kDBoUJsDHyA?uGBwC@uEEaDKoNm@kAIce@wB{Mk@yMo@}@COBw@NIDMD]?OEMKEGCGuAUmJe@mH]mWkAca@kByG]sGY}@?]@AFGFMJOFMBM?QGMKGMCE}@WcAGmIa@sk@uCcMi@s`@qBel@yCcUkAad@eCcSgA_FUkCOuG_@es@yDqNw@cB?A?A@GBO@UIc@Ge@I{F_@m[eBqNu@}BE{@HYLe@TWFQ?e@KQOKQc@YYK[I}Ea@mC]mE{@qFsAeDiAwAk@oJgF}Ay@C@E@WXyExK}LxXc@dADDDL@NCPILIHS@k@v@iExJeBzD}FcDaBy@sAUe@KaB{@iB_AsBoAsAoAmA_A_Ag@_B_Ag@SKC|@wB"}
         * summary : Gandhinagar - Ahmedabad Rd
         * warnings : []
         * waypoint_order : []
         */

        @SerializedName("bounds")
        private BoundsBean bounds;
        @SerializedName("copyrights")
        private String copyrights;
        @SerializedName("overview_polyline")
        private OverviewPolylineBean overviewPolyline;
        @SerializedName("summary")
        private String summary;
        @SerializedName("legs")
        private List<LegsBean> legs;
        @SerializedName("warnings")
        private List<?> warnings;
        @SerializedName("waypoint_order")
        private List<?> waypointOrder;

        public BoundsBean getBounds() {
            return bounds;
        }

        public void setBounds(BoundsBean bounds) {
            this.bounds = bounds;
        }

        public String getCopyrights() {
            return copyrights;
        }

        public void setCopyrights(String copyrights) {
            this.copyrights = copyrights;
        }

        public OverviewPolylineBean getOverviewPolyline() {
            return overviewPolyline;
        }

        public void setOverviewPolyline(OverviewPolylineBean overviewPolyline) {
            this.overviewPolyline = overviewPolyline;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public List<LegsBean> getLegs() {
            return legs;
        }

        public void setLegs(List<LegsBean> legs) {
            this.legs = legs;
        }

        public List<?> getWarnings() {
            return warnings;
        }

        public void setWarnings(List<?> warnings) {
            this.warnings = warnings;
        }

        public List<?> getWaypointOrder() {
            return waypointOrder;
        }

        public void setWaypointOrder(List<?> waypointOrder) {
            this.waypointOrder = waypointOrder;
        }

        public static class BoundsBean {
            /**
             * northeast : {"lat":23.2158147,"lng":72.6427351}
             * southwest : {"lat":23.022503,"lng":72.5711003}
             */

            @SerializedName("northeast")
            private NortheastBean northeast;
            @SerializedName("southwest")
            private SouthwestBean southwest;

            public NortheastBean getNortheast() {
                return northeast;
            }

            public void setNortheast(NortheastBean northeast) {
                this.northeast = northeast;
            }

            public SouthwestBean getSouthwest() {
                return southwest;
            }

            public void setSouthwest(SouthwestBean southwest) {
                this.southwest = southwest;
            }

            public static class NortheastBean {
                /**
                 * lat : 23.2158147
                 * lng : 72.6427351
                 */

                @SerializedName("lat")
                private double lat;
                @SerializedName("lng")
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class SouthwestBean {
                /**
                 * lat : 23.022503
                 * lng : 72.5711003
                 */

                @SerializedName("lat")
                private double lat;
                @SerializedName("lng")
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }
        }

        public static class OverviewPolylineBean {
            /**
             * points : sqokCoa}yLiDF}AA_D?aEJ_FP@cAw@cTq@kS]YSI]CiB@Q@YTa@p@QRkAv@g@^a@f@ULuBGwBBkCDmAHDhE@PsIPaCN{Fh@sCf@wCn@_CZaAFeAA{CEkACyGYyFa@gIcAeAOeEc@uNqBkEw@kB_@qA]}Bo@sAe@o@[k@g@g@o@[e@a@g@wAeAwEaCwBeAmAq@eEaDeC{BiCsCyCwD_FsGaBsBoDqCg@e@_@}@_AyBs@aB{A}DSa@y@w@]i@Sg@I_@Gu@Mo@eAqCw@gDuBmIq@oBgAgC{ByEo@yACOA]HMhB_AnCuATGNAa@eBk@eB{@oC]}@MOm@c@cEwBiAm@iA_@cBUkAS_A[{@_@uDqBgDcB_Bs@qHyDg@]g@e@q@o@}AcB_F{EgBeBsCwBgHgFsCuByGqEm@e@]e@q@kB}DoMcDeK_AkCeAaD[e@SOEAUIKWAEKe@_@w@_@i@u@eAYk@O{@m@qIKk@[k@S]m@[w@]wAc@yA_@o@[aAaAk@w@Qe@I]Gm@_@wQWqLM_LCs@Mm@GEEEaDCcC@uZTuA?kDBoUJsDHyA?uGBwC@uEEaDKoNm@kAIce@wB{Mk@yMo@}@COBw@NIDMD]?OEMKEGCGuAUmJe@mH]mWkAca@kByG]sGY}@?]@AFGFMJOFMBM?QGMKGMCE}@WcAGmIa@sk@uCcMi@s`@qBel@yCcUkAad@eCcSgA_FUkCOuG_@es@yDqNw@cB?A?A@GBO@UIc@Ge@I{F_@m[eBqNu@}BE{@HYLe@TWFQ?e@KQOKQc@YYK[I}Ea@mC]mE{@qFsAeDiAwAk@oJgF}Ay@C@E@WXyExK}LxXc@dADDDL@NCPILIHS@k@v@iExJeBzD}FcDaBy@sAUe@KaB{@iB_AsBoAsAoAmA_A_Ag@_B_Ag@SKC|@wB
             */

            @SerializedName("points")
            private String points;

            public String getPoints() {
                return points;
            }

            public void setPoints(String points) {
                this.points = points;
            }
        }

        public static class LegsBean {
            /**
             * distance : {"text":"26.7 km","value":26672}
             * duration : {"text":"40 mins","value":2399}
             * end_address : Gandhinagar, Gujarat, India
             * end_location : {"lat":23.2154995,"lng":72.6368078}
             * start_address : Ahmedabad, Gujarat, India
             * start_location : {"lat":23.022503,"lng":72.5712842}
             * steps : [{"distance":{"text":"0.5 km","value":458},"duration":{"text":"1 min","value":87},"end_location":{"lat":23.0266199,"lng":72.5711072},"html_instructions":"Head <b>north<\/b> on <b>Ashram Rd<\/b> toward <b>Sheth Mangaldas Rd<\/b>/<wbr/><b>Swami Vivekananda Rd<\/b><div style=\"font-size:0.9em\">Pass by Sheth Mangaldas Girdhardas Memorial Hall (on the left)<\/div>","polyline":{"points":"sqokCoa}yLK?}ADK?s@@a@?{@A_CA_@@eBBU@e@B_@@_BFS?yAF"},"start_location":{"lat":23.022503,"lng":72.5712842},"travel_mode":"DRIVING"},{"distance":{"text":"0.6 km","value":628},"duration":{"text":"1 min","value":88},"end_location":{"lat":23.0271575,"lng":72.5771157},"html_instructions":"Turn <b>right<\/b> onto <b>Nehru Bridge<\/b>","maneuver":"turn-right","polyline":{"points":"kkpkCm`}yLQ@AYBi@SuEc@mMc@kM"},"start_location":{"lat":23.0266199,"lng":72.5711072},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":99},"duration":{"text":"1 min","value":12},"end_location":{"lat":23.0272311,"lng":72.57808469999999},"html_instructions":"Continue onto <b>Rustom Cama Marg<\/b>","polyline":{"points":"wnpkC_f~yLM_E"},"start_location":{"lat":23.0271575,"lng":72.5771157},"travel_mode":"DRIVING"},{"distance":{"text":"0.6 km","value":559},"duration":{"text":"2 mins","value":97},"end_location":{"lat":23.0317823,"lng":72.5770314},"html_instructions":"Turn <b>left<\/b> onto <b>Khanpur Rd<\/b>","maneuver":"turn-left","polyline":{"points":"eopkC_l~yLUSGEICIEOCM?[AmABG?I@KHMJKNU`@GHIHe@Ze@Z[TKHIJWZIFKDG@mBIG?s@@U@e@?gABM?o@@E?mAH"},"start_location":{"lat":23.0272311,"lng":72.57808469999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":103},"duration":{"text":"1 min","value":21},"end_location":{"lat":23.0317451,"lng":72.5760241},"html_instructions":"Turn <b>left<\/b> toward <b>Riverfront Rd<\/b>","maneuver":"turn-left","polyline":{"points":"skqkCme~yLDhE"},"start_location":{"lat":23.0317823,"lng":72.5770314},"travel_mode":"DRIVING"},{"distance":{"text":"4.9 km","value":4861},"duration":{"text":"7 mins","value":398},"end_location":{"lat":23.0630202,"lng":72.597034},"html_instructions":"Turn <b>right<\/b> after Cama Hotel (on the right)","maneuver":"turn-right","polyline":{"points":"mkqkCc_~yL@PsIPe@D{AH_CP{BVwAR{@RwAZ_AR}@NaAJaAFeAA}@C}AAgACC?gBGa@CiCKEAyFa@gIcAOAu@Mq@Iq@Gs@Im@Gw@KgAQu@KwAS{@Mo@Iy@MaAMg@Ia@ImASs@OcAQg@Mc@Km@Qm@QoA]w@W[MWKWOYUQQWYOUOSKQOQQUOOgAu@o@]iB_A]Q_@QgAi@o@[mAq@eEaDaBuAc@e@a@a@gBqBaBsBw@cAoBgCoBkCuAgBKKmCyBa@WWWOMKSSi@ISMYCGc@cAs@aB{A}DIQIOKMKIMMSQIIGIEIEKM[EKCMEQEa@ASEUGYISUk@Ws@M]Ka@GUGW[wAOe@e@sBYiAe@iBq@oBgAgCgAwBs@aBa@}@M[CG?GAG?I?E?EBEDGRKtAs@nCuATGNA"},"start_location":{"lat":23.0317451,"lng":72.5760241},"travel_mode":"DRIVING"},{"distance":{"text":"3.0 km","value":2961},"duration":{"text":"4 mins","value":266},"end_location":{"lat":23.0815653,"lng":72.6161645},"html_instructions":"Turn <b>left<\/b> onto <b>Airport Rd<\/b>","maneuver":"turn-left","polyline":{"points":"{nwkCmbbzLa@eBGMc@wAMc@m@kBCGIWIQEKEGGGQM[UAAi@U{BmA[Qs@_@UMSKu@Sy@Ki@Ie@Ge@KYIe@Q{@_@uDqBy@c@mB_A}As@A?aAg@{Aw@gAk@kAm@UMQO[[KI]]SQaAeA[]w@s@a@_@yAyAk@m@u@u@OOKKUSA?mA_AUQm@e@k@c@YQQOoEaDwAeA{@o@wAaAaEoCc@]IGUWGMO]a@mAeByFwAuEg@}A{BgHw@sBGW]cAg@}AMUMOQO"},"start_location":{"lat":23.0630202,"lng":72.597034},"travel_mode":"DRIVING"},{"distance":{"text":"1.6 km","value":1612},"duration":{"text":"3 mins","value":160},"end_location":{"lat":23.0859893,"lng":72.6298894},"html_instructions":"At <b>Airport Cir<\/b>, take the <b>2nd<\/b> exit and stay on <b>Airport Rd<\/b><div style=\"font-size:0.9em\">Pass by ISCON Villa (on the left in 1.2&nbsp;km)<\/div>","maneuver":"roundabout-left","polyline":{"points":"yb{kC_zezLA?A?AAA?C?AAC?AACAAACAAAAAACAAAC?CAA?CAC?A@GM]_@w@_@i@_@k@UYIOO[CMKm@KsAE{@Ek@UuCEUEUMUMUIMIOCAi@YGCo@YUGaA[A?}@UOEIC]OQK]Yc@g@WYS]ISGQEMCOGm@QmICsAE}ACwAAo@G{CEmA?c@Ag@Ce@Aa@?C?MEyB?g@GoFA_@ASAOK]"},"start_location":{"lat":23.0815653,"lng":72.6161645},"travel_mode":"DRIVING"},{"distance":{"text":"3.4 km","value":3416},"duration":{"text":"4 mins","value":258},"end_location":{"lat":23.116613,"lng":72.63104419999999},"html_instructions":"At <b>Apollo Cir<\/b>, take the <b>1st<\/b> exit onto <b>Gandhinagar - Ahmedabad Rd<\/b><div style=\"font-size:0.9em\">Pass by Kanoria Hospital and Research Centre (on the left in 1.5&nbsp;km)<\/div>","maneuver":"roundabout-left","polyline":{"points":"m~{kCyohzLA?AAAAAAA?AAAA?AgACyA?y@?iA@o@?aCByA@iRN_@?u@?w@?sBB_@@{EBkB@gJBO@cDFs@Ae@@g@?y@@_@?sC@A?uC@gAAmCCmBGs@CqBI}Jc@a@EMAOAK?i@A_ESm]_BKA_I[{COkI_@mCOw@CE?G@G@UDa@H"},"start_location":{"lat":23.0859893,"lng":72.6298894},"travel_mode":"DRIVING"},{"distance":{"text":"1.9 km","value":1891},"duration":{"text":"2 mins","value":137},"end_location":{"lat":23.1334629,"lng":72.63280069999999},"html_instructions":"At <b>Bhat Cir<\/b>, take the <b>4th<\/b> exit and stay on <b>Gandhinagar - Ahmedabad Rd<\/b><div style=\"font-size:0.9em\">Pass by Manvar Party Plot (on the left in 1.6&nbsp;km)<\/div>","maneuver":"roundabout-left","polyline":{"points":"y}alC_whzLA@GBC?A@C?CBE?G@G?GAGAGCECGGAAAAAC?AAA?AAA?As@KSEMAOAUA{AIkFWiDQiAGK?m@Cm@EoKg@eI]I?_FWeBImBIgBIqBKcBIsDO}COy@EqAGcCMIAsGY}@?[?"},"start_location":{"lat":23.116613,"lng":72.63104419999999},"travel_mode":"DRIVING"},{"distance":{"text":"3.7 km","value":3744},"duration":{"text":"4 mins","value":257},"end_location":{"lat":23.1668074,"lng":72.6363606},"html_instructions":"At <b>Koba Cir<\/b>, take the <b>3rd<\/b> exit and stay on <b>Gandhinagar - Ahmedabad Rd<\/b>","maneuver":"roundabout-left","polyline":{"points":"cgelC_bizLA@?@?@A@?@A??@A@CBABC@CBC@CBC@E@A?C@C?A@C?C?A?C?C?CAEACACACCCAACCAACAAACACACAAAC{@S]Ce@CaDQkDOcIc@oa@qBsAEoJc@aDS_CKiMq@gI_@uOw@oKi@sF[kG[_CMqCOmCMcH_@{Ls@_H_@yF["},"start_location":{"lat":23.1334629,"lng":72.63280069999999},"travel_mode":"DRIVING"},{"distance":{"text":"2.1 km","value":2101},"duration":{"text":"3 mins","value":150},"end_location":{"lat":23.1856047,"lng":72.6383917},"html_instructions":"Continue straight past Krishna Clothes Iron Shop to stay on <b>Gandhinagar - Ahmedabad Rd<\/b><div style=\"font-size:0.9em\">Pass by Swaminarayandhamgatekudasan (on the right in 1.3&nbsp;km)<\/div>","maneuver":"straight","polyline":{"points":"qwklCgxizLkEUqMs@qDS}DQa@Cc@Ca@Ca@Cc@Ca@Cc@Ca@Ca@Cc@Ca@Ca@Cc@Ca@C_@C{X{AqDUkCOmBKmEUmCMqNw@cB?"},"start_location":{"lat":23.1668074,"lng":72.6363606},"travel_mode":"DRIVING"},{"distance":{"text":"1.1 km","value":1131},"duration":{"text":"2 mins","value":95},"end_location":{"lat":23.1956698,"lng":72.6393018},"html_instructions":"At <b>Raksha Shakti Cir<\/b>, take the <b>2nd<\/b> exit and stay on <b>Gandhinagar - Ahmedabad Rd<\/b><div style=\"font-size:0.9em\">Pass by Raksha Shakti Circle (Dholakuva Circle) (on the right)<\/div>","maneuver":"roundabout-left","polyline":{"points":"_molC}djzLA??@A??@C@C?C@C?C?C?CAC?GCAAA??AA??AA??Aa@CMCWEGAsF]uG_@iEWg@CeKi@mKk@cBI_AA}@C[B_@DMFKDQF"},"start_location":{"lat":23.1856047,"lng":72.6383917},"travel_mode":"DRIVING"},{"distance":{"text":"1.1 km","value":1055},"duration":{"text":"1 min","value":89},"end_location":{"lat":23.2044089,"lng":72.6427351},"html_instructions":"At <b>Indroda Cir<\/b>, take the <b>2nd<\/b> exit onto <b>CH Rd<\/b><div style=\"font-size:0.9em\">Pass by Vaghela Photography (on the left in 600&nbsp;m)<\/div>","maneuver":"roundabout-left","polyline":{"points":"}kqlCsjjzLEDGBEBGBOBG?I?I?ICGCICGECACCACCCACCCAEACa@UKEME[I}Ea@mAO_AMcASiCg@kCm@eBe@cBk@aA]wAk@oJgF_Ae@]S"},"start_location":{"lat":23.1956698,"lng":72.6393018},"travel_mode":"DRIVING"},{"distance":{"text":"0.8 km","value":798},"duration":{"text":"1 min","value":82},"end_location":{"lat":23.20808,"lng":72.6360558},"html_instructions":"At <b>Nyay Circle- CH -2<\/b>, take the <b>1st<\/b> exit onto <b>Rd Number 2<\/b><div style=\"font-size:0.9em\">Pass by P.K. Tea Stall (on the right)<\/div>","maneuver":"roundabout-left","polyline":{"points":"qbslCc`kzLA@A?A??@A?A?A?A?KNGHg@jAsAxCo@xAm@xAi@lAu@`Bi@nAa@|@CHyC|GgA`Ck@pAc@dA"},"start_location":{"lat":23.2044089,"lng":72.6427351},"travel_mode":"DRIVING"},{"distance":{"text":"0.4 km","value":419},"duration":{"text":"1 min","value":45},"end_location":{"lat":23.2099177,"lng":72.6326448},"html_instructions":"At <b>GH 2 Hemchandra Charya Cir<\/b>, take the <b>2nd<\/b> exit and stay on <b>Rd Number 2<\/b><div style=\"font-size:0.9em\">Pass by S.B.Insurance (on the right)<\/div>","maneuver":"roundabout-left","polyline":{"points":"oyslCkvizLDDBF@D@F?FAHAFCFEDCBEDG@K?k@v@iExJ{AhD"},"start_location":{"lat":23.20808,"lng":72.6360558},"travel_mode":"DRIVING"},{"distance":{"text":"0.8 km","value":766},"duration":{"text":"2 mins","value":138},"end_location":{"lat":23.2158147,"lng":72.6362141},"html_instructions":"Turn <b>right<\/b><div style=\"font-size:0.9em\">Pass by GH 2 Bus Stop (on the left)<\/div>","maneuver":"turn-right","polyline":{"points":"_etlC_aizLIPMIoFyCkAo@CAECKCKCMCm@IKCUCOGcAi@]QIG]Qc@Q]SSMWOk@][S_@[s@s@mA_A_Ag@qAs@MKSKSGKC"},"start_location":{"lat":23.2099177,"lng":72.6326448},"travel_mode":"DRIVING"},{"distance":{"text":"70 m","value":70},"duration":{"text":"1 min","value":19},"end_location":{"lat":23.2154995,"lng":72.6368078},"html_instructions":"Turn <b>right<\/b>","maneuver":"turn-right","polyline":{"points":"yiulCiwizL|@wB"},"start_location":{"lat":23.2158147,"lng":72.6362141},"travel_mode":"DRIVING"}]
             * traffic_speed_entry : []
             * via_waypoint : []
             */

            @SerializedName("distance")
            private DistanceBean distance;
            @SerializedName("duration")
            private DurationBean duration;
            @SerializedName("end_address")
            private String endAddress;
            @SerializedName("end_location")
            private EndLocationBean endLocation;
            @SerializedName("start_address")
            private String startAddress;
            @SerializedName("start_location")
            private StartLocationBean startLocation;
            @SerializedName("steps")
            private List<StepsBean> steps;
            @SerializedName("traffic_speed_entry")
            private List<?> trafficSpeedEntry;
            @SerializedName("via_waypoint")
            private List<?> viaWaypoint;

            public DistanceBean getDistance() {
                return distance;
            }

            public void setDistance(DistanceBean distance) {
                this.distance = distance;
            }

            public DurationBean getDuration() {
                return duration;
            }

            public void setDuration(DurationBean duration) {
                this.duration = duration;
            }

            public String getEndAddress() {
                return endAddress;
            }

            public void setEndAddress(String endAddress) {
                this.endAddress = endAddress;
            }

            public EndLocationBean getEndLocation() {
                return endLocation;
            }

            public void setEndLocation(EndLocationBean endLocation) {
                this.endLocation = endLocation;
            }

            public String getStartAddress() {
                return startAddress;
            }

            public void setStartAddress(String startAddress) {
                this.startAddress = startAddress;
            }

            public StartLocationBean getStartLocation() {
                return startLocation;
            }

            public void setStartLocation(StartLocationBean startLocation) {
                this.startLocation = startLocation;
            }

            public List<StepsBean> getSteps() {
                return steps;
            }

            public void setSteps(List<StepsBean> steps) {
                this.steps = steps;
            }

            public List<?> getTrafficSpeedEntry() {
                return trafficSpeedEntry;
            }

            public void setTrafficSpeedEntry(List<?> trafficSpeedEntry) {
                this.trafficSpeedEntry = trafficSpeedEntry;
            }

            public List<?> getViaWaypoint() {
                return viaWaypoint;
            }

            public void setViaWaypoint(List<?> viaWaypoint) {
                this.viaWaypoint = viaWaypoint;
            }

            public static class DistanceBean {
                /**
                 * text : 26.7 km
                 * value : 26672
                 */

                @SerializedName("text")
                private String text;
                @SerializedName("value")
                private int value;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class DurationBean {
                /**
                 * text : 40 mins
                 * value : 2399
                 */

                @SerializedName("text")
                private String text;
                @SerializedName("value")
                private int value;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class EndLocationBean {
                /**
                 * lat : 23.2154995
                 * lng : 72.6368078
                 */

                @SerializedName("lat")
                private double lat;
                @SerializedName("lng")
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class StartLocationBean {
                /**
                 * lat : 23.022503
                 * lng : 72.5712842
                 */

                @SerializedName("lat")
                private double lat;
                @SerializedName("lng")
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class StepsBean {
                /**
                 * distance : {"text":"0.5 km","value":458}
                 * duration : {"text":"1 min","value":87}
                 * end_location : {"lat":23.0266199,"lng":72.5711072}
                 * html_instructions : Head <b>north</b> on <b>Ashram Rd</b> toward <b>Sheth Mangaldas Rd</b>/<wbr/><b>Swami Vivekananda Rd</b><div style="font-size:0.9em">Pass by Sheth Mangaldas Girdhardas Memorial Hall (on the left)</div>
                 * polyline : {"points":"sqokCoa}yLK?}ADK?s@@a@?{@A_CA_@@eBBU@e@B_@@_BFS?yAF"}
                 * start_location : {"lat":23.022503,"lng":72.5712842}
                 * travel_mode : DRIVING
                 * maneuver : turn-right
                 */

                @SerializedName("distance")
                private DistanceBeanX distance;
                @SerializedName("duration")
                private DurationBeanX duration;
                @SerializedName("end_location")
                private EndLocationBeanX endLocation;
                @SerializedName("html_instructions")
                private String htmlInstructions;
                @SerializedName("polyline")
                private PolylineBean polyline;
                @SerializedName("start_location")
                private StartLocationBeanX startLocation;
                @SerializedName("travel_mode")
                private String travelMode;
                @SerializedName("maneuver")
                private String maneuver;

                public DistanceBeanX getDistance() {
                    return distance;
                }

                public void setDistance(DistanceBeanX distance) {
                    this.distance = distance;
                }

                public DurationBeanX getDuration() {
                    return duration;
                }

                public void setDuration(DurationBeanX duration) {
                    this.duration = duration;
                }

                public EndLocationBeanX getEndLocation() {
                    return endLocation;
                }

                public void setEndLocation(EndLocationBeanX endLocation) {
                    this.endLocation = endLocation;
                }

                public String getHtmlInstructions() {
                    return htmlInstructions;
                }

                public void setHtmlInstructions(String htmlInstructions) {
                    this.htmlInstructions = htmlInstructions;
                }

                public PolylineBean getPolyline() {
                    return polyline;
                }

                public void setPolyline(PolylineBean polyline) {
                    this.polyline = polyline;
                }

                public StartLocationBeanX getStartLocation() {
                    return startLocation;
                }

                public void setStartLocation(StartLocationBeanX startLocation) {
                    this.startLocation = startLocation;
                }

                public String getTravelMode() {
                    return travelMode;
                }

                public void setTravelMode(String travelMode) {
                    this.travelMode = travelMode;
                }

                public String getManeuver() {
                    return maneuver;
                }

                public void setManeuver(String maneuver) {
                    this.maneuver = maneuver;
                }

                public static class DistanceBeanX {
                    /**
                     * text : 0.5 km
                     * value : 458
                     */

                    @SerializedName("text")
                    private String text;
                    @SerializedName("value")
                    private int value;

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public int getValue() {
                        return value;
                    }

                    public void setValue(int value) {
                        this.value = value;
                    }
                }

                public static class DurationBeanX {
                    /**
                     * text : 1 min
                     * value : 87
                     */

                    @SerializedName("text")
                    private String text;
                    @SerializedName("value")
                    private int value;

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public int getValue() {
                        return value;
                    }

                    public void setValue(int value) {
                        this.value = value;
                    }
                }

                public static class EndLocationBeanX {
                    /**
                     * lat : 23.0266199
                     * lng : 72.5711072
                     */

                    @SerializedName("lat")
                    private double lat;
                    @SerializedName("lng")
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }

                public static class PolylineBean {
                    /**
                     * points : sqokCoa}yLK?}ADK?s@@a@?{@A_CA_@@eBBU@e@B_@@_BFS?yAF
                     */

                    @SerializedName("points")
                    private String points;

                    public String getPoints() {
                        return points;
                    }

                    public void setPoints(String points) {
                        this.points = points;
                    }
                }

                public static class StartLocationBeanX {
                    /**
                     * lat : 23.022503
                     * lng : 72.5712842
                     */

                    @SerializedName("lat")
                    private double lat;
                    @SerializedName("lng")
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }
            }
        }
    }

}
