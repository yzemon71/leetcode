class SolutionB:
    def smallestNumber(self, num: int) -> int:
        ans = 0
        if (num >= 0):
            minNum = 0
            for i in range(1,10):
                if str(i) in str(num):
                    minNum = i
                    break
            tmp = str(num).replace(str(minNum),"",1)
            ans_list = [int(i) for i in str(tmp)]
            ans_list = sorted(ans_list)
            ans_list.insert(0,minNum)
            ans = int("".join([str(i) for i in ans_list]))
        elif (num <= 0):
            maxNum = 0
            for i in reversed(range(1,10)):
                if str(i) in str(num):
                    maxNum = i
                    break
            tmp = str(num).replace("-","",1)
            tmp = tmp.replace(str(maxNum),"",1)
            ans_list = [int(i) for i in str(tmp)]
            ans_list = sorted(ans_list, reverse=True)
            ans_list.insert(0,maxNum)
            ans = int("".join([str(i) for i in ans_list])) *-1
        return ans
        



if __name__ == "__main__":
    s = SolutionB()
    num = -7605
    print(s.smallestNumber(num))