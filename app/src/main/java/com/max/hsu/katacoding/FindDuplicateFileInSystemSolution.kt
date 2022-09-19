package com.max.hsu.katacoding

class FindDuplicateFileInSystemSolution {

    fun findDuplicate(paths: Array<String>): List<List<String>> {
        return groupSameContentMutableItemArray(spiltContentToCreateMap(paths))
    }

    fun spiltPathStringWithSpace(pathStr: String): List<String> {
        return pathStr.split(" ")
    }

    fun spiltContentToCreateMap(spiltPathString: Array<String>): Map<String, List<String>> {
        val result = HashMap<String, ArrayList<String>>()
        spiltPathString.forEach {
            val prefixPathList = spiltPathStringWithSpace(it)
            prefixPathList.forEach { pathStr ->
                val spiltContentList = pathStr.split("(")
                // 0:是路徑 1:檔案內容(需先去除')'字元)
                spiltContentList.getOrNull(1)?.replace(")", "")?.let { content ->
                    val arrayPath = result.getOrDefault(content, ArrayList())
                    arrayPath.add(prefixPathList[0] + "/" + spiltContentList[0])
                    result[content] = arrayPath
                }
            }
        }
        return result
    }

    fun groupSameContentMutableItemArray(stringListHashMap: Map<String, List<String>>): List<List<String>> {
        val result = ArrayList<List<String>>()
        stringListHashMap.forEach { (_, u) ->
            if (u.size > 1) result.add(u)
        }
        return result
    }

}
