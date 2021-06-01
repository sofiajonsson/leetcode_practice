def longest_common_prefix(strs)
        return "" if strs.empty?
    commPrefix = ""
    base = strs[0]
    for i in 0..base.length-1
        if strs.all?{|x| x[i] == base[i]}
            commPrefix += base[i]
        else
            break
        end
    end
    commPrefix
end
