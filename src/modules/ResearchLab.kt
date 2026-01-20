//package modules
//
//class ResearchLab : OutpostModule(name = "Испледовска лаб"){
//    override fun performAction(manager: ResourceManager) {
//        val minerls = manager.get("Minerals")
//
//        if (minerls == null || minerls.amount < 30){
//            println("Недостаточно минералов для иследвания")
//            return
//        }else{
//            minerls.amount -= 30
//            println("Лаборатораня проводит иследования (миниралов -30)")
//        }
//    }
//}