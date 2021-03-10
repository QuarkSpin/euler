using System.Linq;
using static CSharpEuler.Utils.MathFunctions;

namespace CSharpEuler
{
    public class Problem002 : ISolvable<int>
    {
        public int Solve() => Fibonacci()
            .TakeWhile(x => x <= 4_000_000)
            .Where(x => x % 2 == 0)
            .Sum();
    }
}
